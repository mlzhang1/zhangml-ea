package com.example.zhangmlea.socket.UDPChat.socket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPSocketClientThread implements Runnable {
     DatagramSocket datagramSocket;
     private Logger log = LoggerFactory.getLogger(UDPSocketClientThread.class);
    {
        try {
            datagramSocket = new DatagramSocket(8081);
            log.info("Jerry-创建端点8081成功");
        } catch (SocketException e) {
            log.error("Jerry-创建端点时发生异常：",e.getMessage());
            e.printStackTrace();
        }
    }

    byte[] ibuf = new byte[1024];
    DatagramPacket datagramPacket = new DatagramPacket(ibuf,ibuf.length);
    @Override
    public void run() {
        while (true){
            try {
                datagramSocket.receive(datagramPacket);
            } catch (IOException e) {
                log.error("接受信息并将其存储在包中发生异常：",e.getMessage());
                e.printStackTrace();
            }
            System.out.println("Tom：" + new String(datagramPacket.getData(), 0, datagramPacket.getLength()));
        }
    }
}
