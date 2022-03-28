package com.doit.Predict;

import java.util.function.Predicate;

public class demo02 {
    public static void main(String[] args) {
        //判断一个字符串是否既包含h又包含w
        method("helloWord",s->s.toLowerCase().contains("h"),s -> s.toLowerCase().contains("w"));
    }
    public static void method(String s, Predicate<String> p1,Predicate<String> p2){
        boolean test = p1.and(p2).test(s);
        if (test) {
            System.out.println("既包含h又包含w");
        }

    }
}
