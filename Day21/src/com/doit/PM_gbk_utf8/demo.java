package com.doit.PM_gbk_utf8;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(new FileInputStream("d:\\g\\aaa\\gbk.txt"),"gbk");
        Writer w = new OutputStreamWriter(new FileOutputStream("d:\\g\\aaa\\utf.txt"),"utf-8");
        char [] chars = new char[1024];
        int len=0;
        while ((len=r.read(chars))!=-1){
            w.write(chars);
        }
        r.close();
        w.close();

        //InputStream使用BufferedReader的readline方法
        InputStream in =new FileInputStream("Day21\\buffer\\2.txt");
        Reader r1 =new InputStreamReader(in);
        BufferedReader br = new BufferedReader(r1);
        String s = br.readLine();
        String s1 = s.split(" ")[1];
        String path = s1.substring(1);
        System.out.println(path);
        br.close();
    }
}
