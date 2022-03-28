package com.doit.demo01;

import java.io.File;
import java.io.FileFilter;

public class demo01 {
    public static void main(String[] args) {
        File f = new File("d:\\g\\aaa");
        //以什么结尾,字符串方法
/*        File[] fe = f.listFiles();
        for (File file : fe) {
            if (file.getName().toLowerCase().endsWith("txt")) {
                System.out.println(file);
            }
        }*/
        //接口
        File[] fil = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return false;
                }
                return pathname.getName().toLowerCase().endsWith("txt");
            }
        });
        for (File file : fil) {
            System.out.println(file);
        }
    }
}
