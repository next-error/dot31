package com.doit.Buble;

public class Choose {
    public static void main(String[] args) {
        int [] arr  ={3,8,2,5,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int b =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=b;
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
