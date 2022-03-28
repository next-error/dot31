package com.doit.Reviw;

import java.math.BigDecimal;
import java.math.BigInteger;

public class AM_0309 {
    public static void main(String[] args) {
        /*
        正则表达式
        Math类
        BigInter
        BigDecmal
        包装类与基本类型:装箱与拆箱
        异常与自定义异常
         */
        //正则:[a-zA-Z_0-9]:字母数字下划线
        //matches方法
        //^ 否
            //. 任意字符 \\.表示一个点
            //+ 至少一个  {n}个  {n,m}n-m个
        // ?表示至多一次
        //{n,}至少n次
        //判断邮箱练习
        String s = "[a-zA-z_0-9]+@([a-zA-z_0-9]+\\.[a-zA-z_0-9]+)";
        String s1 = "1693hherf@fjgb.fhg";
        System.out.println(s1.matches(s));

        //Math类
        /*
        静态常量PI
        静态方法:max min round:float返回int.double返回long
                random方法 abs ceil floor
         */

        //BigInteger:计算长度超过long的运算
        /*
        构造方法内传字符串
        加减乘除方法.除法舍去小数
        转换int long;类型方法
         */
        //没有小数,有小数报错!!!!!
        BigInteger b1 = new BigInteger("12345678901234576890");
        BigInteger b2 = new BigInteger("12345678901234576890");
        b1.add(b2);//返回BigInteger类型,打印默认调用ToString方法
        b1.subtract(b2);
        b1.multiply(b2);
        System.out.println(b1.divide(b2));//整除,没有小数


        //Bigdecmal :小数精确计算
        /*
        构造方法传入字符串类型
        加减乘除方法 除法需要有精确位数和取位规则

         */
        BigDecimal b3 = new BigDecimal("3.5");
        BigDecimal b4= new BigDecimal("3.7");
        b3.add(b4);
        b3.subtract(b4);
        b3.multiply(b4);
        b3.divide(b4,3,BigDecimal.ROUND_HALF_DOWN);



        // 装箱和拆箱
        /*
        重写了equals方法,在byte范围内两个 interage类型对象一样
         */


        //字符串转化基本类型(包装类型的方法) 没有字符char的
        int a1 = Integer.parseInt("123");//写错类型会直接报错

    //
        char [] ca = new String("ABCFEG").toCharArray();
        System.out.println(ca);
        String s3 ="abc";
        String s4 ="def";
        String s5=s3.replace(s3,"hnm");//返回一个新的字符串
        System.out.println(s5);

        //异常处理 及自定义异常


    }
}
