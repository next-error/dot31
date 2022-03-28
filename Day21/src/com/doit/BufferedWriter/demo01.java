package com.doit.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class demo01 {
    /*
    BufferedWriter特有方法:
        newline--换行
     */
    public static void main(String[] args) throws IOException {
        BufferedWriter w = new BufferedWriter(new FileWriter("Day21\\buffer\\1.txt"));
        w.write("张三");
        w.newLine();
        w.flush();
        w.write("张素");
        w.newLine();
        w.flush();
        w.close();
    }
}
