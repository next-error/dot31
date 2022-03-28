package com.doit.demo.LianXiTi;

public class Text05 {
    public static void main(String[] args) {
        /*
        已知一个数组 arr = {1, 2, 3, 4, 5}; 用程序实现把数组中的元素值交换，

      交换后的数组 arr = {5, 4, 3, 2, 1}; 并在控制台输出交换后的数组元素。

         */
        int [] arr = {1, 2, 3, 4, 5};
        int [] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(exchange(arr,arr2)[i]);
        }
    }
    //定义方法,交换
    public static int [] exchange (int [] arr, int [] arr2){
        for (int i = 0; i < arr.length; i++) {
            arr2[arr.length-1-i] = arr[i];
        }return arr2;
    }
}
