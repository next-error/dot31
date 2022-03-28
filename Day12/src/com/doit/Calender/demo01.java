package com.doit.Calender;

import java.util.Calendar;
import java.util.Date;

public class demo01 {
    public static void main(String[] args) {
        //getInstance
        //注意;西方月份是0-11,每周从周日开始
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));
        //日历转化为日期 getTime
        //日历设置add set
        //  将日历设置为2000年1月1日,今天是2022年3月7日
/*        c.add(Calendar.YEAR,-21);
        c.add(Calendar.MARCH,-1);
        c.add(Calendar.DATE,-6);*/

        c.set(2000,0,33);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DATE));
        Date date =c.getTime();
        System.out.println(date);
    }

    }

