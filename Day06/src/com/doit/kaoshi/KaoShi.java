package com.doit.kaoshi;



public class KaoShi {
    public static void main(String[] args) {


        int[] arr = {3, 8, 2, 5, 0};
        int [] arr1 =new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
             arr1[arr.length-1-i]= arr[i];

        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        }

}
