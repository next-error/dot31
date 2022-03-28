package com.TSET.Test06;

import java.math.BigDecimal;
import java.math.BigInteger;

public class test06 {
    public static void main(String[] args) {
        /*
        算 987654321123456789000 除以 123456789987654321的值,注意这个结果为BigInteger类型,将BigInteger类型转换为字符串类型,
        然后转换为double类型.精确计算3120.25乘以1.25,注意这个结果为BigDecimal类型,同样转换为字符串类型,
        然后转换为double类型,然后获取这两个结果的最大值
         */
        BigInteger in1  =new BigInteger("987654321123456789000");
        BigInteger in2  =new BigInteger("123456789987654321");
        BigInteger big1 =in1.divide(in2);
        String s1 =big1.toString();
        //System.out.println(s1);
        double dble1 = big1.doubleValue();

        BigDecimal dec1 =new BigDecimal("3120.25");
        BigDecimal dec2 =new BigDecimal("1.25");
        BigDecimal big2 =dec1.divide(dec2,5,BigDecimal.ROUND_HALF_DOWN);
        String s2 = big2.toString();
        //System.out.println(s2);
        double dble2 = big2.doubleValue();
        double max = Math.max(dble1,dble2);
        System.out.println(max);


    }
}
