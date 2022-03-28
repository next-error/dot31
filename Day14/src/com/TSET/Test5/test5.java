package com.TSET.Test5;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入聊天词汇:");
        String s = sc.nextLine();

    minganci(s);
    }
    public  static  void   minganci(String s){
        String [] list = "色情,枪,军火".split(",");

        System.out.println("__________________");

        for (int i = 0; i < list.length; i++) {
            String s2=list[i];

             s =s.replaceAll(s2,"*");


        }System.out.println(s);



    }
}
