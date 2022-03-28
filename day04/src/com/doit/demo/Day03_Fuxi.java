package com.doit.demo;

import java.util.Random;
import java.util.Scanner;

public class Day03_Fuxi {
    public static void main(String[] args) {
//1.引用数据类型
/*
        Scanner
        导包:import java.util.Scanner;
        定义变量并赋值: 变量类型 变量名 = new 变量类型(System.in);   //这里变量类型就是类名(这里调用的是jre中的.class文件)
        使用: 变量.方法名 nextInt:输入整数 nextdouble:输入小数  next:输入字符串,只能接受空格前的字符串

        Scanner sc = new Scanner(System.in); //定义Scanner类型的变量 并赋值
        System.out.println("请输入一个整数:");
        int a = sc.nextInt();//定义变量a 接收用户输入的值
        System.out.println("请输入一个小数:");
        double b = sc.nextDouble();
        System.out.println("请输入一个字符串:");
        String c = sc.next();
        System.out.println(c + a +b12);
*/

/*
        Random
        导包:import java.util.Random;
        定义变量并赋值: 变量类型 变量名 = new 变量类型();
        使用: 变量.方法名 nextInt(MAX):随机产生[0,max)的整数  nextdouble:随机产生[0,1)的小数
*/
/*        Random ra = new Random();
        double b1 = ra.nextDouble();
        System.out.println(b1);
        int a1 = ra.nextInt(100);
        System.out.println(a1);*/
//2.流程控制
/*        if
        if(条件){满足条件执行的语句}

        if(条件){满足条件执行的语句}
        else{不满足时执行的语句}

        if(条件1) {满足条件1执行的语句}
        else if (条件2) {满足条件2执行的语句}
			...
			else {不满足时执行的语句}
        if注意事项:
        如果if语句只有一句话,花括号可以省略
        注意变量的作用域范围
                java编译时只检查语法是否正确,不检查变量的值*/
        //输入数字,输出周几
/*
        Scanner week = new Scanner(System.in);
        System.out.println("请输入周几(1-7):");
        int week_num = week.nextInt();
        if (week_num == 1){
            System.out.println("周一");
        }else if(week_num == 2){
            System.out.println("周二");
        }else if(week_num == 3){
            System.out.println("周三");
        }else if(week_num == 4){
            System.out.println("周四");
        }else if (week_num == 5){
            System.out.println("周五");
        }else  if (week_num == 6){
            System.out.println("周六");
        }else if (week_num == 7){
            System.out.println("周日");
        }else {
            System.out.println("输入有误");
        }
*/



    }
}
