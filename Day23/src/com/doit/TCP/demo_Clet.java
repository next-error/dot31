package com.doit.TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class demo_Clet {
    /*
    Socket:客户端类
    构造方法:
        Socket(String host, int port)
        Socket(InetAddress address, int port)
    方法:
            InputStream getInputStream()
            OutputStream getOutputStream()
     */
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket s = new Socket("127.0.0.1", 8888);
        //向客户端发送数据
        OutputStream out = s.getOutputStream();
        out.write("你好".getBytes());
        System.out.println("__________________________");
        //接收客户端数据
        byte[] bytes =new byte[1024];

        InputStream in = s.getInputStream();
        int len =in.read(bytes);
        System.out.println(new String(bytes,0,len));
        in.close();
        out.close();
        s.close();
    }
}
