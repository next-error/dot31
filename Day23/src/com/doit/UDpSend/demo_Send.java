package com.doit.UDpSend;

import java.io.IOException;
import java.net.*;

public class demo_Send {
    /*
    发送端:
    构造方法:public DategramSocker()
    方法: send(DategramPackt d)

    发送端数据包:
    构造方法: public DategramPackt()

     */
    public static void main(String[] args) throws IOException {
        //创建发送端对象
        DatagramSocket ds = new DatagramSocket();
        //创建发送端数据包
        byte[] bytes ="hello word".getBytes();
            //接收的ip:
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,ip,6666);
        //发送
        ds.send(dp);
        ds.close();
    }
}
