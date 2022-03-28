package com.doit.Test01;

import java.text.ParseException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = sc.nextInt();
        int days = cal_Day(year);
        int t_day= cal_DAY(year);
        System.out.println(days);
        System.out.println(t_day);
    }
    /*        DateFormat da = new SimpleDateFormat("yyyy");
           Date year1 = da.parse(year);*/
    //用Calender实现
    public static int cal_Day(int year) throws ParseException {

        Calendar c = Calendar.getInstance();
        int count = 0;
        for (int i = 1; i < 32; i++) {
            c.set(year, 1, i);
            count++;
            if (c.get(Calendar.MONTH) == 2) {
                break;
            }
        }
        return count-1;
    }
    public static int cal_DAY(int year){
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);
        c.add(Calendar.DATE,-1);
        int i =c.get(Calendar.DATE);
        return i;
    }
}
