package com.TSET.Test08;

import java.util.Calendar;
import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int year = sc.nextInt();
        daysInFeb(year);
    }
    public static void daysInFeb (int year){
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,2,1);
        calendar.add(Calendar.DATE,-1);
        int days =calendar.get(Calendar.DATE);
        System.out.println(days);
    }
}
