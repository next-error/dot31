package com.doit.demo_Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class test {
    public static void main(String[] args) throws IOException {
        /*
        子类构造方法:
        方法:write(字符 字符数组  字符串)
            flush:刷新,每次写入后存在于缓冲区,刷新写入文件
            close:关闭文件,自带一次刷新
         */
        Writer w = new FileWriter(new File("d:\\g\\aaa\\a3.txt"));
        //写入一个字符
        w.write('a');
        w.flush();
        //写入一个字符数组
        char [] ch = {'a','b','c'};
        w.write(ch);
        w.flush();
        //写入字符数组一部分
        w.write(ch,1,2);
        w.flush();
        //写入字符串
        w.write("\r\n你好");
        w.close();
    }
}
