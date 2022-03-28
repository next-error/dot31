package com.doit.String;

import java.util.Locale;

public class demo02 {
    public static void main(String[] args) {
        //字符数组与字节数组转为字符串        ******需要AS-II码值对照********
       /* char [] aaa={'a','b'};
        //String s = "Abc"
        String s =new String(aaa) ;
        System.out.println(s);*/
        String s1 = "abcdefgabc";
        System.out.println("++++++++++++++++++++++++");
        //将字符串转化为数组: split,支持正则
        //数组直接打印是地址值,
        String s = "a,b,c";
        String [] arr = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);

        //System.out.println(s==s1);//false

        //字符串转化为字符数组  字节数组
        char[] chars = s1.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        //字符串比较:equals 和equalsIgnoreCase 比较内容,后者区分大小写
        System.out.println(s1.equalsIgnoreCase("Ab"));

        //以什么字符结尾:startswith 和endswith,返回布尔值
        System.out.println(s1.startsWith("b"));
        System.out.println(s1.endsWith("b"));

        //大小写转化:toupercase  tolowercase
        String s2= s1.toUpperCase(Locale.ROOT);
        System.out.println(s2);
        System.out.println(s2.toLowerCase(Locale.ROOT));

        //charat 字符串索引 length() 方法 数组里length是属性,集合中size()是方法
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        //字符串反转

        String ss ="";
        for (int i = s1.length()-1; i >=0; i--) {
           ss+= s1.charAt(i);
        }
        System.out.println(ss);
        //indexOf(int 或String) 根据字符返回int类型的索引,返回第一次出现的索引,没有返回-1
        System.out.println(s1.indexOf('c'));
        System.out.println(s1.indexOf("bc"));
        System.out.println(s1.indexOf('b', s1.indexOf('b') + 1));
            //lastindexof,返回最后一次出现的索引
        System.out.println(s1.lastIndexOf('c'));
        System.out.println(s1.lastIndexOf("bc"));

        //substring():截取字符串,从指定索引一直截取到末尾,返回一个新的字符串
        System.out.println(s1.substring(2));
            //截取指定长度字符串,左闭右开
        System.out.println(s1.substring(2, 5));

        //repla 与replaall:(旧的字符,新的字符)返回一个新的字符串
            //注意:replace替换字符串用接口实现(String是该接口的一个实现类)
            //replaceall支持正则替换
        String s5 = "abc--def------ghi";
        String s6 ="abc--def--ghi";
        System.out.println(s5.replace('-', ','));
        System.out.println(s5.replace("-", ","));
        System.out.println(s5.replaceAll("-+", ","));
        String s7 =s5.replaceAll("-+", ",");
        System.out.println(s7);
    }
}
