package com.doit.demo02;

import java.util.Random;
import java.util.Scanner;

public class Day04_Test {
    public static void main(String[] args) {

 // 1.生成两个1-10的随机数,分别作为两个数组的长度.
        Random ra = new Random();
        int l1 = ra.nextInt(10)+1;
        int l2 = ra.nextInt(10)+1;
        int [] zu1= new int[l1];
        //String [] zu2= new String[l2];
        int [] zu2 = new int[l2];
        System.out.println("l1:"+l1);
        System.out.println("l2"+l2);
        System.out.println("-------------");

//2.向第一个数组中以循环键盘录入的方式添加元素
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < l1; i++) {
            System.out.println("请输入一个整数:");
            zu1[i] = sc.nextInt();
        }
        System.out.println("_________________1" +
                "");
//3.生成1-100之间的随机数 为第二个数组的每个元素赋值
        for (int j = 0; j < l2; j++) {
            zu2[j] = ra.nextInt(100)+1;
            System.out.println(zu2[j]);
        }
        System.out.println("____________________");
//4.将两个数组合并 为一个新的数组
        int [] zu3 = new int[zu1.length+zu2.length];

                int i =0;
                for (; i < zu1.length; i++) {
                    zu3[i]= zu1[i] ;
                }
                for (int j = 0; j < l2; j++) {
                    zu3[zu1.length+j]= zu2[j];
                }
        for (int m = 0; m < l1 + l2; m++) {
            System.out.println(zu3[m]);
        }



//5.去掉新数组的最大值和最小值 求平均值

       /* int min = zu3[0];
        int max = zu3[0];
        int sum =0;
        double average ;
        for (int j = 0; j < l1+l2; j++) {
            if (zu3[i]<min) {
                min = zu3[i];
            }
            if (zu3[i]>max) {
                max= zu3[i];
            }
            sum = zu3[i] ;
        }
        average = (sum-max-min)/(l1+l2-2)/1.0;*/
    }
}
