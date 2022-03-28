package com.doit.Test;

import java.io.File;

public class test {
    public static void main(String[] args) {
        File file =new File("d:\\duoyi");
        show (file);

    }
    public static void show(File file){
        if (file.equals(null) || !(file.exists()))
        System.out.println("路径不存在");
        else {
            File[] fil = file.listFiles();
            for (File file1 : fil) {


                if (file1.isFile()) {
                    System.out.println(file1);
                }else {
                    show(file1);
                }
            }



        }

    }
}
