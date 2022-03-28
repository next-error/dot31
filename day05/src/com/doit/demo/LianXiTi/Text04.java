package com.doit.demo.LianXiTi;

import java.util.Scanner;

public class Text04 {
    public static void main(String[] args) {
        /*
        已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引。
            并在控制台输出找到的索引值。如果没有查找到，则输出-1

         */
        int [] arr = {19, 28, 37, 46, 50};
        int a = getNum();
        System.out.println(check(a, arr));
    }
    // 键盘录入方法
    public static int getNum(){
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        a = sc.nextInt();
        return a;
    }
    //判断数字是否在数组
    public static int check (int a , int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                return i;
            }
        }return -1;
    }

}
