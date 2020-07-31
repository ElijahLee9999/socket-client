package com.ykt.im.socket;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-22 10:19
 */
@Slf4j
public class SocketClientInit extends ChannelInitializer<SocketChannel> {

    private static final int headLength = 4;

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        log.info("客户端连接, HOST={}, PORT={}, channelId= {}", ch.localAddress().getHostName(), ch.localAddress().getPort(), ch.id().asLongText());

        // 10秒客户端没有写事件则向服务器发送心跳否则关闭连接
        pipeline.addLast(new IdleStateHandler(0, 10, 0));
        //设置编码方式
        pipeline.addLast(new StringEncoder(CharsetUtil.UTF_8));
        // 主要用于处理大数据流
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
                if (readableBytes < headLength) {
                    log.info("接收到信息::可读长度={}，小于4, ##不进行解码", readableBytes);
                    return;
                }

                // 标记字节流开始位置
                msg.markReaderIndex();

                // 读取2个节包头, 查看剩下的数据流长度
                int dataLength = msg.readShort();
                int readableBytes1 = msg.readableBytes();
                if (readableBytes1 < dataLength) {
                    log.info("接收到信息::包头指定包体长度={}, 剩余数据流可读长度={}, ##不进行解码", dataLength, readableBytes1);
                    // 移除读取标准位置
                    msg.resetReaderIndex();
                    return;
                }

                log.info("接收到信息::包头指定包体长度={}, 剩余数据流可读长度={}, ##准备进行解码", dataLength, readableBytes1);
                //读取整个包长度
                ByteBuf buf = Unpooled.buffer(dataLength + 2);
                buf.writeShort(dataLength);
                buf.writeBytes(msg);
                // 放行到业务handler层
                out.add(Unpooled.wrappedBuffer(buf));
            }
        });

        //业务handler
        pipeline.addLast(new ClientHandler());
    }
}
