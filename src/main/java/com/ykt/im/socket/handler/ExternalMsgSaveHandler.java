package com.ykt.im.socket.handler;

import com.ykt.im.socket.AbstractHandler;
import com.ykt.im.socket.protobuf.ExternalMsgSaveWrap;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-31 18:49
 */
@Slf4j
public class ExternalMsgSaveHandler extends AbstractHandler {
    @Override
    public void handler(ChannelHandlerContext ctx, Object message) {
        if (message instanceof ExternalMsgSaveWrap.ExternalMsgSave) {
            ExternalMsgSaveWrap.ExternalMsgSave msg = (ExternalMsgSaveWrap.ExternalMsgSave) message;
            // TODO
        } else {
            log.warn("消息解码错误");
        }
    }
}
