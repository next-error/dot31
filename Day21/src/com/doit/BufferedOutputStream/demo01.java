package com.doit.BufferedOutputStream;

import java.io.*;

public class demo01 {
    //构造方法:传参OutputStream子类
    //方法同OutputStream

    public static void main(String[] args) throws IOException {
        OutputStream out = new BufferedOutputStream(new FileOutputStream("Day21\\src\\buffer\\2.txt",true));

        //写一个字节
        out.write('a');
        //写一个字节数组
        byte []bytes ="hello word\r\n".getBytes();
        out.write(bytes);
        //写入字节数组一部门
        out.write(bytes,1,3);
        out.close();
    }



}
