package com.ykt.im;

import com.ykt.im.socket.Protocol;
import com.ykt.im.socket.protobuf.UserInfoWrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.CharsetUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Method;
import java.util.List;

@SpringBootTest
class ImApplicationTests {


    @Test
    void contextLoads() {
    }

    @Test
    void socketTest() throws InterruptedException {


        Bootstrap bootstrap = new Bootstrap()
                .group(new NioEventLoopGroup())
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ChannelPipeline pipeline = ch.pipeline();
                        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
                        //pipeline.addLast(new ByteArrayEncoder());
                        pipeline.addLast(new ChunkedWriteHandler());
                        //解码器
                        pipeline.addLast("decoder", new MessageToMessageDecoder<ByteBuf>() {
                            /**
                             * [包头 2 Bytes] ： 除了包头4个字节外包体的大小
                             * [包体 2 Bytes] ：包的协议ID
                             * [包体 ] ： protobuf 字节数据
                             * @param ctx
                             * @param msg
                             * @param out
                             * @throws Exception
                             */
                            @Override
                            protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
                                // 可读长度
                                int readableBytes = msg.readableBytes();
                                if (readableBytes < 4) {
                                    System.out.println(String.format("客户端:接收到信息::可读长度=%s，小于4, ##不进行解码", readableBytes));
                                    return;
                                }

                                // 标记字节流开始位置
                                msg.markReaderIndex();
                                // 读取2个节包头, 查看剩下的数据流长度
                                int dataLength = msg.readShort();
                                int readableBytes1 = msg.readableBytes();
                                if (readableBytes1 < dataLength) {
                                    System.out.println(String.format("客户端:接收到信息::包头指定包体长度=%s, 剩余数据流可读长度=%s, ##不进行解码", dataLength, readableBytes1));
                                    // 移除读取标准位置
                                    msg.resetReaderIndex();
                                    return;
                                }

                                System.out.println(String.format("客户端:接收到信息::包头指定包体长度=%s, 剩余数据流可读长度=%s, ##准备进行解码", dataLength, readableBytes1));
                                //读取整个包长度
                                ByteBuf buf = Unpooled.buffer(dataLength + 2);
                                buf.writeShort(dataLength);
                                buf.writeBytes(msg);
                                // 放行到业务handler层
                                out.add(Unpooled.wrappedBuffer(buf));
                            }
                        });
                        pipeline.addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                            @Override
                            protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
                                int len = msg.readableBytes();
                                //读取2个字节头部
                                int head = msg.readShort();
                                //读取2个字节协议号
                                int cmd = msg.readShort();
                                //protobuf的长度
                                int bufLen = head - 2;
                                System.out.println(String.format("客户端:Socket消息:len=%s, cmd=%s, bufLen=%s", len, Integer.toHexString(cmd), bufLen));

                                boolean flag = true;
                                for (Protocol p : Protocol.class.getEnumConstants()) {
                                    //匹配协议
                                    if (p.getProto() == cmd) {
                                        flag = false;
                                        Object message = null;

                                        if (null != p.getDataFrom()) {
                                            //读取protobuf数据
                                            byte[] protoBuf = new byte[bufLen];
                                            msg.readBytes(protoBuf);

                                            //反射获取protobuf对象
                                            String className = p.getDataFrom();
                                            Class clazz = Class.forName(className);
                                            Method method = clazz.getMethod("parseFrom", byte[].class);
                                            message = method.invoke(clazz, protoBuf);

                                            System.out.println(message.toString());
                                        }
                                    }
                                }

                                if (flag) {
                                    System.out.println(String.format("客户端:Socket消息:未知协议号[%s]", Integer.toHexString(cmd)));
                                }
                            }
                        });

                    }
                });

        ChannelFuture channelFuture = bootstrap.connect("192.168.1.152", 38082).sync();

        ByteBuf beat = Unpooled.buffer(4);
        beat.writeShort(2);
        beat.writeShort(Protocol.HeartBeat.getProto());
        channelFuture.channel().writeAndFlush(beat);
        System.out.println("客户端发送心跳---1");

        UserInfoWrap.UserInfo userInfo = UserInfoWrap.UserInfo.newBuilder()
                .setCorpid("111111111")
                .setUserid("222222")
                .build();

        byte[] bytes = userInfo.toByteArray();
        int leng = bytes.length;
        ByteBuf byteBuf = Unpooled.buffer(leng + 4);
        byteBuf.writeShort(leng + 2);
        byteBuf.writeShort(Protocol.UserInfo.getProto());
        byteBuf.writeBytes(bytes);

        channelFuture.channel().writeAndFlush(byteBuf);
        System.out.println("客户端发送登录---2");

        Thread.sleep(1000);

        beat = Unpooled.buffer(4);
        beat.writeShort(2);
        beat.writeShort(Protocol.HeartBeat.getProto());
        channelFuture.channel().writeAndFlush(beat);
        System.out.println("客户端发送心跳---3");

        Thread.sleep(1000);
        channelFuture.channel().close();

        channelFuture.channel().closeFuture().sync();
    }
}
