package com.doit.demo_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo01 {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream(new File("d:\\g\\aaa\\a2.txt"));
/*        byte [] bytes =new byte[1];
        int read = in.read(bytes);
        System.out.println(read);
        read = in.read(bytes);
        System.out.println(read);*/
/*        //循环读取内容,一次一个字节
        int read = 0;
        while ( (read=(in.read()))!=-1)
        System.out.println((char) read);*/
        //使用byte数组一次读取多个字节
/*        byte [] bytes = new byte[1024];
        int len=0;
        while ((len=(in.read(bytes)))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        in.close();*/
    }
}
/*        int read = in.read();
        System.out.println(read);
         read = in.read();
        System.out.println(read);
        read = in.read();
        System.out.println(read);
        read = in.read();
        System.out.println(read);
        read = in.read();
        System.out.println(read);
        read = in.read();
        System.out.println(read);
        read = in.read();
        System.out.println(read);*/