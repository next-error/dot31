package com.doit.Supplier;

import java.util.Arrays;
import java.util.function.Supplier;

public class demo01 {
    public static void main(String[] args) {
        int [] arr ={2,5,7,1,8};
        //调用method方法,method方法中的get方法是大括号中重写的方法,return的arr[arr.length-1]赋值给max
        method(()->{
            Arrays.sort(arr);
            return arr[arr.length-1];
        });
    }
    public static void method (Supplier<Integer> s){
        Integer max = s.get();
        System.out.println(max);

    }
}
