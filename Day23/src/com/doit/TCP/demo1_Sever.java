package com.doit.TCP;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class demo1_Sever {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        //创建OutputStream写入
        String fileName = System.currentTimeMillis()+".mp4";
        OutputStream out = new FileOutputStream("d:\\g\\aaa\\"+fileName);
        InputStream in  = s.getInputStream();
        //循环读写
        byte [] bytes = new byte[1024];
        int len =0;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes);
        }
        System.out.println("----------------------");
        OutputStream ssout = s.getOutputStream();
        ssout.write("上传成功".getBytes());
        //关闭资源
        in.close();
        ssout.close();
        out.close();
        s.close();
        ss.close();
    }
}
