package com.doit.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo_Sever {
    /*
    ServerSocket:服务器类
    构造方法:ServerSocket(int port) 传入开放的端口号
    方法:Socket accept() ,监听并接收客户端的连接,返回Socket类型
                利用此返回Socket类型的对象区分哪个客户端在服务器上发收数据
     */
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        //接收客户端发送内容
        byte [] bytes = new byte[1024];
        InputStream in = s.getInputStream();
        int len = in.read(bytes);
        System.out.println(new String(bytes,0,len));
        //向客户端回馈数据
        OutputStream out = s.getOutputStream();
        out.write("你也好".getBytes());
        out.close();
        in.close();
        s.close();

    }
}
