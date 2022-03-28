package com.doit.BuffferInputStream;

import java.io.*;

public class demo01 {
    /*
    缓冲流:目的是加快流的执行效率
    方法:
        int read()读一个字节
        int read(byte[]bytes) 读一个字节数组
    构造方法:
        public BufferedInputStream(InputStream in)

     */
    public static void main(String[] args) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream("Day21\\src\\buffer\\1.txt"));
        //读取一个字节
/*        int date=0;
        while ((date=in.read())!=-1){
            System.out.println(date);
        }*/
        //读取一个字节数组
        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len=in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        in.close();
    }
}
