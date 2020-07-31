package com.ykt.im.socket.handler;

import com.ykt.im.socket.AbstractHandler;
import com.ykt.im.socket.protobuf.ExternalEditWrap;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-31 18:47
 */
@Slf4j
public class ExternalEditHandler extends AbstractHandler {
    @Override
    public void handler(ChannelHandlerContext ctx, Object message) {
        if (message instanceof ExternalEditWrap.ExternalEdit) {
            ExternalEditWrap.ExternalEdit msg = (ExternalEditWrap.ExternalEdit) message;
            // TODO
        } else {
            log.warn("消息解码错误");
        }
    }
}
