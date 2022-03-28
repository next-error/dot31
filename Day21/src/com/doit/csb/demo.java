package com.doit.csb;

import java.io.*;
import java.util.TreeSet;

public class demo {
    /*
    获取文本数据
    写入treeset集合
    写会文本
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Day21\\buffer\\csb.txt"));
        TreeSet<String> ts = new TreeSet();
        String s = null;
        while ((s=br.readLine())!=null){
            ts.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("Day21\\buffer\\csb.txt"));
        for (String t : ts) {
           bw.write(t);
           bw.newLine();
           bw.flush();

        }
        br.close();
        bw.close();
    }
}
