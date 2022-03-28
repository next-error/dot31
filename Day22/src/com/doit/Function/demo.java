package com.doit.Function;

import java.util.function.Function;

public class demo {
    public static void main(String[] args) {
        //标准格式
        method("100",(String s)->{
            int i = Integer.parseInt(s);
            return i;
        });
        //省略格式
        method("100",s -> Integer.parseInt(s));
        //极简格式
        /*
        极简模式:当重写的方法只传入一个参数,并且重写方法体只有一句话且也需要传入一个参数时,参数可以省略
         */
        method("200", Integer::parseInt);

    }
    public static void method (String num, Function<String,Integer> f ){
        Integer apply = f.apply(num);
        System.out.println(apply);
    }
}
