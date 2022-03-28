package com.doit.StringBuilder;

import javafx.scene.shape.Shape3D;

public class demo01 {
    public static void main(String[] args) {
        //StringBuilder:字符串缓冲区,主要有append方法, toString方法和reverse方法
/*        String s = "abc";

        String s1 =new StringBuilder(s).append("deg").reverse().toString();
        System.out.println(s1);
        //注意:append可以添加任何类型的变量,最后都tostring即可,引用类型调佣的是该引用类型的tostring方法,若自定义需要重写tostring
       String s2= new StringBuilder("abc").append(new Object()).append(1344).append(true).toString();
        System.out.println(s2);*/
        byte [] a={1,2,3,4,5};
        String s5 ="[";
        for (int i = 0; i < a.length; i++) {
            s5=new StringBuilder(s5).append(a[i]).append(",").toString();
        }s5=new StringBuilder("]").toString();
        System.out.println(s5);
    }
}
