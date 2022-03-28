package com.doit.HomeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    /*
    将一个文件中的内容读取,然后倒叙写回
     */
    public static void main(String[] args) throws IOException {
        /*
        思路:
            读取文件,将每次读取的内容放入数组
            数组元素放入集合,用集合的reverse方法反转,再转为新数组
            新数组write
         */
        //读取文件
        Reader r = new FileReader(new File("d:\\g\\aaa\\a2.txt"));
        Writer w = new FileWriter(new File("d:\\g\\aaa\\a2_2.txt"));
        //定义数组存放每次读取的内容
        char[] cha_list = new char[1024];
        int len =0;
        while ((len= r.read(cha_list))!=-1){
            //System.out.println(new String(cha,0,len));
            //数组内容写入集合
            ArrayList<Character> arr = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                char ch= cha_list[i];
                arr.add(ch);
            }
            //System.out.println(arr);
            Collections.reverse(arr);
            Character[] cha_dec =  arr.toArray(new Character[0]);
            for (int i = 0; i < cha_dec.length; i++) {
                w.write(cha_dec[i]);
            }


        }
        r.close();
        w.close();
    }
}
