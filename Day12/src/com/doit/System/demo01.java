package com.doit.System;

import java.util.Calendar;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        //获取当前系统时间毫秒数的方法\
        //1.Date中的gettime  2.Calender中的getInstance    3.System中的静态方法currentTimeMillis
        long time1 = new Date().getTime();
        long time2 = Calendar.getInstance().getTimeInMillis();
        long time3 = System.currentTimeMillis();
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
