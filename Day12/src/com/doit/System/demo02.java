package com.doit.System;

public class demo02 {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4};
        int [] arr2 =new int[3];
        System.arraycopy(arr1,1,arr2,1,2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
