package com.ykt.im.socket;

import io.netty.channel.ChannelHandlerContext;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-22 11:46
 */
public abstract class AbstractHandler {

    /**
     * 协议处理
     *
     * @param message
     */
    public abstract void handler(ChannelHandlerContext ctx, Object message);
}
