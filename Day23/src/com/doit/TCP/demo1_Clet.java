package com.doit.TCP;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class demo1_Clet {
    public static void main(String[] args) throws IOException {
        //创建客服端对象
        Socket s = new Socket("127.0.0.1",8888);
        //创建IntputStream读取客户端硬盘文件
        InputStream in = new FileInputStream("d:\\g\\大明王朝1566-01.mp4");
        OutputStream out = s.getOutputStream();
        //循环读写
        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes);
        }
        //读写完成关闭
        s.shutdownOutput();
        //读返回结果
        InputStream sin = s.getInputStream();
        int length = sin.read(bytes);
        System.out.println(new String(bytes,0,length));
        //关闭资源
        in.close();
        out.close();
        s.close();
    }
}
