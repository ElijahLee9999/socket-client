package com.ykt.im.socket;

import com.ykt.im.socket.handler.ElsewhereLoginHandler;
import com.ykt.im.socket.handler.ExternalEditHandler;
import com.ykt.im.socket.handler.ExternalListHandler;
import com.ykt.im.socket.handler.ExternalMsgSaveHandler;
import com.ykt.im.socket.handler.ExternalSaveHandler;
import com.ykt.im.socket.handler.LogoutHandler;
import com.ykt.im.socket.handler.UserMsgHandler;
import com.ykt.im.socket.handler.UserMsgSyncSaveHandler;
import com.ykt.im.socket.protobuf.ExternalDelWrap;
import com.ykt.im.socket.protobuf.ExternalEditWrap;
import com.ykt.im.socket.protobuf.ExternalInfoWrap;
import com.ykt.im.socket.protobuf.ExternalListWrap;
import com.ykt.im.socket.protobuf.ExternalMsgSaveWrap;
import com.ykt.im.socket.protobuf.ExternalMsgWrap;
import com.ykt.im.socket.protobuf.ExternalSaveWrap;
import com.ykt.im.socket.protobuf.UserInfoWrap;
import com.ykt.im.socket.protobuf.UserMsgSendWrap;
import com.ykt.im.socket.protobuf.UserMsgSyncSaveWrap;
import com.ykt.im.socket.protobuf.UserMsgSyncWrap;
import com.ykt.im.socket.protobuf.UserMsgWrap;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 协议
 *
 * @author Elijah
 * @create 2020-07-21 17:26
 */
@Getter
@AllArgsConstructor
public enum Protocol {

    //客户端
    HeartBeat(0x0001, null, null, "心跳"),
    UserInfo(0x0002, UserInfoWrap.UserInfo.class.getName(), null, "成员信息/成员登录"),
    ExternalInfo(0x0003, ExternalInfoWrap.ExternalInfo.class.getName(), null, "客户信息"),
    ExternalDel(0x0004, ExternalDelWrap.ExternalDel.class.getName(), null, "已删除客户列表"),

    UserMsgSend(0x0011, UserMsgSendWrap.UserMsgSend.class.getName(), null, "成员消息发送结果"),
    UserMsgSync(0x0012, UserMsgSyncWrap.UserMsgSync.class.getName(), null, "成员消息同步"),
    ExternalMsg(0x0013, ExternalMsgWrap.ExternalMsg.class.getName(), null, "客户消息"),


    //服务端
    ElsewhereLogin(0x1001, null, ElsewhereLoginHandler.class, "异地登录"),
    Logout(0x1002, null, LogoutHandler.class, "已退出"),
    ExternalList(0x1003, ExternalListWrap.ExternalList.class.getName(), ExternalListHandler.class, "客户列表"),
    ExternalSave(0x1004, ExternalSaveWrap.ExternalSave.class.getName(), ExternalSaveHandler.class, "客户信息入库结果"),
    ExternalEdit(0x1005, ExternalEditWrap.ExternalEdit.class.getName(), ExternalEditHandler.class, "修改客户备注/标签"),

    UserMsg(0x1011, UserMsgWrap.UserMsg.class.getName(), UserMsgHandler.class, "推送成员消息"),
    UserMsgSyncSave(0x1012, UserMsgSyncSaveWrap.UserMsgSyncSave.class.getName(), UserMsgSyncSaveHandler.class, "成员消息同步入库结果"),
    ExternalMsgSave(0x1013, ExternalMsgSaveWrap.ExternalMsgSave.class.getName(), ExternalMsgSaveHandler.class, "客户信息入库结果");

    private int proto;
    private String dataFrom;
    private Class<? extends AbstractHandler> handler;
    private String name;

}
