package com.ykt.im.socket;

import com.google.protobuf.MessageLite;
import com.ykt.im.socket.protobuf.ExternalDelWrap;
import com.ykt.im.socket.protobuf.ExternalInfoWrap;
import com.ykt.im.socket.protobuf.ExternalMsgWrap;
import com.ykt.im.socket.protobuf.UserInfoWrap;
import com.ykt.im.socket.protobuf.UserMsgSendWrap;
import com.ykt.im.socket.protobuf.UserMsgSyncWrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;


/**
 * 协议发送服务
 *
 * @author Elijah
 * @create 2020-07-23 10:11
 */
public class SocketSender {

    public static void send(Channel channel, Protocol protocol, MessageLite messageLite) {
        int len = 0;
        if (null != messageLite) {
            byte[] protobuf = messageLite.toByteArray();
            len = protobuf.length;
        }

        ByteBuf byteBuf = Unpooled.buffer(len + 4);
        byteBuf.writeShort(len + 2);
        byteBuf.writeShort(protocol.getProto());
        if (null != messageLite) {
            byteBuf.writeBytes(messageLite.toByteArray());
        }

        channel.writeAndFlush(byteBuf);
    }


    public static boolean heartBeat(Channel channel) {
        send(channel, Protocol.HeartBeat, null);
        return true;
    }

    public static boolean userInfo(Channel channel, UserInfoWrap.UserInfo userInfo) {
        send(channel, Protocol.UserInfo, userInfo);
        return true;
    }

    public static boolean externalInfo(Channel channel, ExternalInfoWrap.ExternalInfo externalInfo) {
        send(channel, Protocol.ExternalInfo, externalInfo);
        return true;
    }

    public static boolean externalDel(Channel channel, ExternalDelWrap.ExternalDel externalDel) {
        send(channel, Protocol.ExternalDel, externalDel);
        return true;
    }

    public static boolean userMsgSend(Channel channel, UserMsgSendWrap.UserMsgSend userMsgSend) {
        send(channel, Protocol.UserMsgSend, userMsgSend);
        return true;
    }

    public static boolean userMsgSync(Channel channel, UserMsgSyncWrap.UserMsgSync userMsgSync) {
        send(channel, Protocol.UserMsgSync, userMsgSync);
        return true;
    }

    public static boolean externalMsg(Channel channel, ExternalMsgWrap.ExternalMsg externalMsg) {
        send(channel, Protocol.ExternalMsg, externalMsg);
        return true;
    }

}
