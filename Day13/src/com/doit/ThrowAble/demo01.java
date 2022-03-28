package com.doit.ThrowAble;
/*
多catch捕获异常

 */
public class demo01 {
    public static void main(String[] args) {
        int [] arr={};
        try{

            arr[-1]=1;
            int a=1/0;

        }
        catch (Throwable e){
            System.out.println(e);
        }



    }
    public static void add_arr (int [] arr ){
        for (int i = 0; i < arr.length-1; i++) {//这里是遍历不到,但不会报异常
            arr[i] =i;
        }
    }
    public static void show (int []arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
        }
    }
}
