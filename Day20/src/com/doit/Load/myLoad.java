package com.doit.Load;

import java.io.*;
import java.util.Properties;

public class myLoad {
    /*
    Properties双列集合与IO流结合使用
    使用字符流或者字节流写入 p.load方法会自动开启流,load完成后需要手动关闭
     */
    public static void main(String[] args) throws IOException {
    Properties p = new Properties();
    Reader r = new FileReader(new File("Day20\\src\\aaa\\aaa.properties"));
    p.load(r);//这里r不会close
    r.close();
        System.out.println(p);
    }
}
