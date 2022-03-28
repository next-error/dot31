package com.doit.demo_Reader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        Reader r = new FileReader("d:\\g\\aaa\\a1.txt");
        Reader r2 = new FileReader(new File("d:\\g\\aaa\\a.txt"));

        //单个字符读取
/*        int date=0;//记录的是读取的数据
        while ((date = (r.read()))!=-1){
            System.out.println((char) date);

        }
        r.close();*/
        //字符数组
        int len=0;//记录的是读取的个数
        char [] charr = new char[1024]  ;

        while ((len =r.read(charr))!=-1){
            System.out.println(new String(charr,0,len));
        }
        r.close();
    }
}
