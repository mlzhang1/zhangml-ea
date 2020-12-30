package com.example.zhangmlea.socket.UDPChat.socket_Tom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPSocketServerThread implements Runnable {

    private Logger log = LoggerFactory.getLogger(UDPSocketServerThread.class);

    byte[] ibuf = new byte[1024];
    String message;
    Scanner scanner = new Scanner(System.in);
    DatagramPacket datagramPacket;

    {
        try {
            datagramPacket = new DatagramPacket(ibuf, ibuf.length, InetAddress.getByName("127.0.0.1"), 8081);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    DatagramSocket ds;

    {
        try {
            ds = new DatagramSocket(8083, InetAddress.getByName("127.0.0.1"));
        } catch (SocketException | UnknownHostException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            message = scanner.nextLine();
            datagramPacket.setData(message.getBytes());
            try {
                assert ds != null;
                ds.send(datagramPacket);
                if (message.equals("88")){
                    ds.close();
                    log.info("关闭聊天");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
