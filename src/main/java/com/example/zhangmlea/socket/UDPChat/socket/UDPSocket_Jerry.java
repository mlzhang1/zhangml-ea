package com.example.zhangmlea.socket.UDPChat.socket;

public class UDPSocket_Jerry {

    public static void main(String[] args) {
        //分别启动发信息线程和收消息线程
        Thread thread1 = new Thread(new UDPSocketClientThread());
        Thread thread2 = new Thread(new UDPSocketServerThread());
        thread1.start();
        thread2.start();
    }
}
