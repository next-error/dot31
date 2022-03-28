package com.TSET.Test7;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) throws ParseException {
        /*
        键盘录入一个生日的字符串(xxxx-xx-xx) 计算这个人活了多少天
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期(xxxx-xx-xx):");
        String s = sc.nextLine();
        live_Days(s);
    }
    public  static void live_Days(String s) throws ParseException {
        DateFormat dateFormat =new SimpleDateFormat("yy-MM-dd");
        Date birth = dateFormat.parse(s);
        long b = birth.getTime();
        int days =(int )(b/1000/60/60/24);
        System.out.println(days);
    }
}
