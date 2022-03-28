package com.doit.Buble;

public class demo01 {
    public static void main(String[] args) {
        int [] list ={3,8,2,5,0};
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length-1-i; j++) {
                if (list[j]>list[j+1]) {
                    int b =list[j];
                    list[j]=list[j+1];
                    list[j+1]=b;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
