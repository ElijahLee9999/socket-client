package com.ykt.im.socket;

import com.ykt.im.utils.ApplicationContextUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 业务协议处理
 *
 * @author Elijah
 * @create 2020-07-22 11:00
 */
@Slf4j
@ChannelHandler.Sharable
public class ClientHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        int len = msg.readableBytes();
        //读取2个字节头部
        int head = msg.readShort();
        //读取2个字节协议号
        int cmd = msg.readShort();
        //protobuf的长度
        int bufLen = head - 2;
        log.info("Socket消息:len={}, cmd={}, bufLen={}", len, Integer.toHexString(cmd), bufLen);

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
                }

                Class<? extends AbstractHandler> handler = p.getHandler();
                // SpringBoot 是从IOC中获取处理类
                // TODO Android端要处理一下用ClassName获取到实例
                AbstractHandler abstractHandler = ApplicationContextUtil.getBean(handler);
                //执行处理方法
                abstractHandler.handler(ctx, message);
            }
        }

        if (flag) {
            log.warn("Socket消息:未知协议号[{}]", Integer.toHexString(cmd));
        }
    }

    //当通道建立时
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("当前链路已经激活了");
        ctx.fireChannelActive();
    }

    /**
     * 断线重连
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        // 可能出现业务判断离线后再次触发 channelInactive
        log.warn("SocketChannel触发 channelInactive 掉线![{}]", ctx.channel().id().asLongText());
        userOffLine(ctx);
    }

    /**
     * 当超过n秒没有写时会触发该事件
     *
     * @param ctx
     * @param evt
     * @throws Exception
     */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            // 读空闲
            if (idleStateEvent.state() == IdleState.WRITER_IDLE) {
                // 发送心跳
                SocketSender.heartBeat(ctx.channel());
            }
        }
        super.userEventTriggered(ctx, evt);
    }

    /**
     * 异常打印
     *
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("Socket连接异常", cause);
    }

    /**
     * 用户重连操作
     */
    private void userOffLine(ChannelHandlerContext ctx) throws IOException {
        ctx.channel().close();

        // TODO 做重连操作
    }
}
