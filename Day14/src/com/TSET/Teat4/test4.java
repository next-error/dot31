package com.TSET.Teat4;

import java.util.Locale;

public class test4 {
    public static void main(String[] args) {
        //将字符串 "we-like-java" 转换为 "EW-EKIL-AVAJ"   也就是去掉前后空格,并将每个单词反转.
        String s = "we-like-java";
        shou_fan(s);
    }
    public static void shou_fan (String s){
        String [] list = s.split("-");
        String s2 ="";
        for (int i = 0; i < list.length; i++) {
            String s1 =list[i];
            for (int j = s1.length()-1; j >=0; j--) {
                s2 +=s1.charAt(j);
            }
            if(i!=list.length-1)
            s2+="-";
        }
        String s3 =s2.toUpperCase(Locale.ROOT);
        System.out.println(s3.toString());

    }
}
