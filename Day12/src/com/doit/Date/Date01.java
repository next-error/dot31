package com.doit.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date01 {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        System.out.println(date);//Mon Mar 07 14:42:14 CST 2022--Date类型

        //gettime,返回从1970年1月1日0时0分0秒到现在的毫秒数
        System.out.println(date.getTime());//1646635334419

        //将date转化为常用形式,字符串格式
        DateFormat  f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        String s =f.format(date);
        System.out.println(s);//2022-03-07 14:42:14 星期一

        //将字符串格式转化为日期
            //获取1949-1-1的毫秒数
        String s1 ="1949-1-1";
        DateFormat daf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 =   daf.parse(s1);
        System.out.println(date1.getTime());
        //  小练习:计算你活了多少天
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生日期:yyyy-MM-dd");

        String s2 = sc.next();
        System.out.println(live_Day(s2));

    }
    public static  int live_Day(String s2) throws ParseException {
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        long date = da.parse(s2).getTime();
        long now = new Date().getTime();
        int day = (int)((now -date)/1000/3600/14);
        return day;
    }
}
/*        byte[] bytes = {65,66,67,68};

        //将字节数组转换为字符串  解码
        String s3 = new String(bytes);
        System.out.println(s3);*/