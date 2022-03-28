package com.doit.Function;

import java.util.function.Function;

public class Num {
    public static void main(String[] args) {
        //将一个字符的数组转化为整数,再扩大10倍,用俩Function
        method("12",(s)->{
            return Integer.parseInt(s);
        },(Num)->{
            return Num*10;
        });
        method("11",s->Integer.parseInt(s),num->num*10);
        method("14",Integer::parseInt,num->num*10);
    }
    public static void method(String s, Function<String,Integer>f1,Function<Integer,Integer>f2){
        Integer bigNum = f1.andThen(f2).apply(s);
        System.out.println(bigNum);
    }
}
