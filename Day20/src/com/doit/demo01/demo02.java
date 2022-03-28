package com.doit.demo01;

import java.io.File;
import java.io.FileFilter;

public class demo02 {
    public static void main(String[] args) {
        File f1 = new File("d:\\duoyi");
        show (f1);
    }
    public static void show(File f1) {
        File[] fiArr = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()) {
                    return true;
                }
                return pathname.getName().toLowerCase().endsWith("java");
            }
        });
        for (File file : fiArr) {
            if (file.isFile()) {
                System.out.println(file);
            }else {
                show(file);
            }
        }
    }
}
