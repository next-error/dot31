package com.doit.demo02;

import java.util.Scanner;

public class Day03_Test {
    public static void main(String[] args) {
        /*
        输入星期数，显示今天的减肥活动
        周一：跑步
        周二：游泳
        周三：慢走
        周四：动感单车
        周五：拳击
        周六：爬山
        周日：好好吃一顿
         */
/*        Scanner week = new Scanner(System.in);
        System.out.println("请输入1-7");
        int week_num = week.nextInt();
        switch (week_num) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入有误");
        }*/

        // 所谓水仙花数是指一个数3位数，其每位数字立方和等于其本身，如153 = 1x1x1+5x5x5+3x3x3
/*        for (int i= 100 ; i < 1000 ; i++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (i == ge*ge*ge+shi*shi*shi+bai*bai*bai) {
                System.out.println(i);
            }

        }*/

        //1.键盘录入任意输入一个正数(小于10位)，求它的位数
/*        Scanner zhengnum = new Scanner(System.in);
        System.out.println("请输入一个小于十位的正数");
        //int num = zhengnum.nextInt();
        double num = zhengnum.nextDouble();
        int i = 1;
        int n = 0;
        while (num / i >=1){
            n++;
            i *=10;
        }
        System.out.println(n);*/
        //2.本金10000元存入银行，年利率是千分之三，每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少？
/*        double benjin = 10000;
        for (int i = 0; i < 5; i++) {
            benjin *= 1.003;
        }
        System.out.println(benjin);*/

        //3.计算1000以内所有不能被7整除的整数之和
/*        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i/7!=0) {
                sum+=i;
            }

        } System.out.println(sum);//499479*/

        //4.一张纸的厚度大约是0.08mm,对折多少次之后能达到珠穆朗玛峰的高度(8848.13米)
 /*       double zhi = 0.08;
        int i = 0;
        for (; zhi<8848.13*1000; i++)
            {
                zhi *=2;
        }

         System.out.println(i);*/

        //5.用while循环和for循环输出1-1000之间能被5整除的数，且每行输出5个
        //while循环
        int i = 1;
        while (i <= 1000) {
            if (i % 5 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(i + " ");
                }
            }i++;

            System.out.println();

        }
        System.out.println("_______________");
        //查找一个元素在数组中的位置,有则返回索引,没有则返回-1
        int [] arr = {1,2,34,5,7};
        int key = 15;
        boolean flag = false;//定义一个变量,当循环进入if时改变其值,否则不改变;  当循环结束后根据其值是否改变判断遍历完成后是否有满足if条件的元素
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==key) {
                System.out.println(j);
                flag = true;
            }
            //else {System.out.println(-1);} 若在循环中使用else,则每次循环不满足if时都会执行else语句,在循环中使用else要注意!!!!
            }if(!flag){ //flag本身是布尔类型,直接if true or if false;
            System.out.println(-1);
        }
    }
}
