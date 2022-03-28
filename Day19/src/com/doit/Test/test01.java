package com.doit.Test;

import java.io.File;

public class test01 {
    public static void main(String[] args) {
        File file = new File("d:\\g");
        System.out.println(file);
        //isFile 是否是文件
        System.out.println(file.isFile());
        //是否是文件
        System.out.println(file.exists());
        //list 显示文件和文件夹
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }
        //显示文件和文件夹的全路径
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
    }
}
