package com.doit.Math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.function.BiFunction;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.max(10.0, 12));//12.0
        System.out.println(Math.abs(-10.3));//10.3
        System.out.println(Math.ceil(10.9));//11.0
        System.out.println(Math.floor(10.9));//10.0
        System.out.println(Math.round(3.1f));//int
        System.out.println(Math.round(3.1));//long
        System.out.println(Math.random());//0-1随机数
//BigInteger
        //返回BigInteger类型,打印默认调用tostring 可以用XXvalue方法转换为数值类型
        long a = 19888888888L;
        BigInteger aa = new BigInteger("19888888888445644");
        BigInteger bb = new BigInteger("3546546546457577567764");
        BigInteger CC = aa.add(bb);
        System.out.println(CC);

        System.out.println(aa.subtract(bb));
        System.out.println(aa.multiply(bb));
        System.out.println(aa.divide(bb));
    //BigDecimal 精确的小数计算
        BigDecimal b1 = new BigDecimal("3.1");
        BigDecimal b2 = new BigDecimal("3.7");
        BigDecimal b3 =b1.divide(b2,3,BigDecimal.ROUND_HALF_DOWN);//除法 保留几位小数,保留方式
        System.out.println(b3);
        System.out.println(b1.add(b2));
        System.out.println(b1.subtract(b2));

        //字符串转换为基本类型 没有字符类型
        int c1 = Integer.parseInt("10");
        System.out.println(c1);
        boolean c2 = Boolean.parseBoolean("true");
        System.out.println(c2);
        byte c3 = Byte.parseByte("12");
        System.out.println(c3);
        short c4 = Short.parseShort("14");
        System.out.println(c4);
        long c5 = Long.parseLong("23");
        System.out.println(c5);
        float c6 = Float.parseFloat("3.456");
        System.out.println(c6);
        Double c7 =Double.parseDouble("2.54");
        System.out.println(c7);

        //基本类型与其对应的包装类型转换:自动装箱 自动拆箱
        Integer d1 = 10; //自动装箱
        int d2 = d1; //自动拆箱
            //Arraylist中一直在用
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);//自动装箱
        int  d3 = arr.get(0); //自动拆箱

        Character d4 ='a';
        char d5 =d4;

    }
}
