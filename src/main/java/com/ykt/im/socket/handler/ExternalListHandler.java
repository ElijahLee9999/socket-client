package com.ykt.im.socket.handler;

import com.ykt.im.socket.AbstractHandler;
import com.ykt.im.socket.protobuf.ExternalListWrap;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-31 18:43
 */
@Slf4j
public class ExternalListHandler extends AbstractHandler {
    @Override
    public void handler(ChannelHandlerContext ctx, Object message) {
        if (message instanceof ExternalListWrap.ExternalList) {
            ExternalListWrap.ExternalList msg = (ExternalListWrap.ExternalList) message;
            // TODO
        } else {
            log.warn("消息解码错误");
        }
    }
}
