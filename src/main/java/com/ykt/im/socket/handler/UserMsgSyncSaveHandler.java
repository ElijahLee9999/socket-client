package com.ykt.im.socket.handler;

import com.ykt.im.socket.AbstractHandler;
import com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author Elijah
 * @create 2020-07-31 18:49
 */
@Slf4j
public class UserMsgSyncSaveHandler extends AbstractHandler {
    @Override
    public void handler(ChannelHandlerContext ctx, Object message) {
        if (message instanceof UserMsgSyncSaveWrap.UserMsgSyncSave) {
            UserMsgSyncSaveWrap.UserMsgSyncSave msg = (UserMsgSyncSaveWrap.UserMsgSyncSave) message;
            // TODO
        } else {
            log.warn("消息解码错误");
        }
    }
}
