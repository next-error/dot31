package com.doit.UDpSend;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class demo_Revice {
    public static void main(String[] args) throws IOException {
        //创建接收端
        DatagramSocket ds1 = new DatagramSocket(6666);
        //创建接收数据包
        byte[] bytes =new byte[1024*64];
        DatagramPacket dp1 = new DatagramPacket(bytes,bytes.length);
        //接收数据
        ds1.receive(dp1);
        //拆包
        InetAddress ip =dp1.getAddress();//发送端ip
        int port = dp1.getPort();//发送端端口
        int length = dp1.getLength();//发送端数据长度

        System.out.println(ip.getHostAddress()+":"+port+"  "+new String(bytes,0,length));
    }
}
