package com.doit.Predict;

import java.io.File;
import java.util.function.Predicate;

public class demo {
    /*
    测试型接口,返回布尔值
     */
    public static void main(String[] args) {
        //判断文件名是否以.java结尾
    method("aaa.java",s -> s.toLowerCase().endsWith("java"));
    method("222.txt",(s -> {
        return s.toLowerCase().endsWith("java");
    }));

    }
    public static void method(String s, Predicate<String> p){
        boolean test = p.test(s);
        System.out.println(test);
    }
    public static void method(File file, Predicate<File> p){
        boolean test = p.test(file);
        System.out.println(test);
    }
}
