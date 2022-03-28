package com.doit.Function;

import java.util.Arrays;
import java.util.function.Function;

public class ARR {
    public static void main(String[] args) {
        //根据长度创建数组
        method(10,(length)->{
            return new int[length];
        });
        method(5,length->new int[length]);
        method(7,int[]::new);

    }
    public static void method(int length, Function<Integer,int[]> f){
        int[] arr = f.apply(length);
        System.out.println(Arrays.toString(arr));
    }
}
