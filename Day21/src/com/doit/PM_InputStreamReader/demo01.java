package com.doit.PM_InputStreamReader;

import java.io.*;

public class demo01 {
    /*
    字节通往字符的桥梁
    方法
        read:读字符 读字符数组char[]
        构造方法;传入InputStream子类对象(FileInputStream或BufferedInputStream),指定编码--不区分大小写
     */
    public static void main(String[] args) throws IOException {
        Reader isr = new InputStreamReader(new FileInputStream("d:\\g\\aaa\\gbk.txt"),"gbk");
/*        byte[] bytes= new byte[1];
        int date =0;//结果:24352  19977 两个字符的码值

        while ((date=isr.read())!=-1)
        {
            System.out.println(date);
        }*/
/*        char [] ch = new char[1];
        int len = 0;
        while ((len = isr.read(ch))!=-1 ) {
            System.out.println(new String(ch,0,len));
        }*/
        isr.close();

    }
}
