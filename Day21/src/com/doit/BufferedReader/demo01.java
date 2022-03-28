package com.doit.BufferedReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo01 {
    /*
    BufferedReader特有方法:
        readline:读一行,读到换行符为止,返回字符串类型没有数据返回null

     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Day21\\buffer\\1.txt"));
        String s = null;
        while ((s=br.readLine())!=null){
            System.out.println(s);
        }
    }
}
