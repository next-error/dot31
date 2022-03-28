package com.doit.Lambda;

import java.io.File;

public class demo01 {
    public static void main(String[] args) {
        /*
        Lambda表达式:针对的是只有一个方法的接口
        语法格式:(参数类型 参数名)->{ 执行代码 }
            可以理解为对接口方法的匿名重写
        省略格式:

         */
        //标准格式
        new Thread(() -> {
            System.out.println("线程任务");
        }).start();
        //省略格式
        new Thread(()-> System.out.println("线程任务3")).start();

         new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程任务2");
            }
        }).start();

         File dir = new File("d:\\duoyi");
        File[] filearr = dir.listFiles((File f)->{
           return f.getName().toLowerCase().endsWith("java") ;
        });
        //省略格式
        File [] files = dir.listFiles(f->f.getName().toLowerCase().endsWith("java"));
        for (File file : files) {
            System.out.println(file);
        }

    }
}
