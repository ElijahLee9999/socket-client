package com.ykt.im.socket;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Socket client
 *
 * @author Elijah
 * @create 2020-07-22 10:04
 */
@Slf4j
@Component
public class SocketService {

    private EventLoopGroup work = new NioEventLoopGroup();

    /**
     * 启动 Socket client
     *
     * @param host 域名
     * @param port 端口
     * @throws InterruptedException
     */
    public void start(String host, int port) throws InterruptedException {
        log.info("开始创建socket");
        Bootstrap bootstrap = new Bootstrap()
                .group(new NioEventLoopGroup())
                .channel(NioSocketChannel.class)
                .handler(new SocketClientInit());

        ChannelFuture future = bootstrap.connect(host, port).sync();

        if (null != future && future.isSuccess()) {
            log.info("启动 socket client 成功");
        }
    }

    /**
     * 销毁
     */
    @PreDestroy
    public void destroy() {
        work.shutdownGracefully().syncUninterruptibly();
        log.info("关闭 socket client 成功");
    }
}
