package com.doit.demo;

import java.util.Random;
import java.util.Scanner;

public class Day04_ShuZu {
    public static void main(String[] args) {
//数组的三种定义方式


/*        int[] arry2 = new int[]{10,20,30};
        int[] arry3 = {10,20,30};//简化写法,定义的同时需要赋值,否则报错 如:int [] arry4 ;  arry4 = {10,20};
        // int: 定义数字类型  []:代表数组类型
        //定义一个字节数组 长度为3
        int[] arry1 = new int[3];
        //定义一个长整形数组  指定元素  100000000000(11个0)
        long[] arry5 = new long[]{100000000000L};
        //定义一个float(单精度浮点型)类型数组  指定元素 3.14  1.25
        float[] arry6 = {3.14f,1.25f};
        //定义一个double(双精度浮点型)类型数组 指定长度为5
        double[] arry7 = new double[5];
        //定义一个字符类型数组  指定元素  a   b   c
        char [] arry8 = {'a','b','c'};
        //定义一个布尔类型数组  指定长度 3
        boolean [] arry9 = new boolean[3];
        //定义一个字符串类型数组  指定元素  I   Love  Java 三个元素
        String[] arry10 = {"I","Love","Java"};
        //定义一个Scanner类型数组 指定长度 3
        Scanner[] arry11 = new Scanner[3];
        //定义一个Random类型数组 指定长度为4
        Random[] arry12 = new Random[4];
        //定义一个当前类(Test01) 类型数组 指定长度5
        Day04_ShuZu [] arry13 = new Day04_ShuZu[5]*/;

        //定义一个byte类型数组 长度为3  获取第一个元素的值  并将第2个元素赋值为100并获取打印
/*        byte[] arr1 = new byte[3];
        byte a1 = arr1[0];
        arr1 [1] = 100;
        System.out.println(arr1[1]);
        System.out.println(arr1[0]);
        //定义一个double类型数组 长度为3 获取第一个元素的值 并将第3个元素赋值为10.1 并获取打印
        double[] arr2 = new double[3];
        double a2 = arr2[0];
        arr2[2] = 10.1;
        System.out.println(arr2[2]);
        System.out.println(arr2[0]);
        //定义一个字符类型数组 长度为3 获取第二个元素的值 并将第1个元素赋值为'a' 并获取打印
        char[] arr3 = new char[3];
        char a3 = arr3[1];
        arr3[0] = 'a';
        System.out.println(arr3[1]);
        System.out.println(arr3[0]);
        //定义一个boolean类型数组 长度为3 获取第3个元素的值  将第一个元素赋值为true 并获取打印
        boolean[] arr4 = new boolean[3];
        boolean a4 = arr4[2];
        arr4[0] = true;
        System.out.println(arr4[0]);
        //定义一个字符串类型数组 长度4 获取第一个元素的值 将234元素依次赋值为 I Love Java 并获取打印
        String [] arr5 = new String[4];
        arr5[1] = "I";
        arr5[2] = "Love";
        arr5[3] = "Java";
        System.out.println(arr5[1]+"  "+arr5[2]+"  "+arr5[3]);
        //定义一个float类型数组 长度为5 将最后一个元素的值 赋值为3.14 并获取打印
        float [] arr6 = new float[5];
        arr6[4] = 3.14f;
        System.out.println(arr6[4]);*/

//  数组变量名对应于数组在 jvm 堆 中的地址.同一个数组名最多只能对应一个地址,一个地址可以对应多个变量名
        String[]  str = {null,"I","Love","Java",null};
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
        //
        int [] aaa = {3,8,2,5,0};
        int sum =0;
        for (int i = 0; i < aaa.length; i++) {

            sum +=aaa[i];

        }
        System.out.println(sum);
        int sum1 =0;
        for (int i = 0; i < aaa.length; i++) {
            if (aaa[i] %2 ==0) {
                sum1 += aaa[i];
            }
        }
        System.out.println(sum1);

        int n = 0;
        for (int i = 0; i < aaa.length; i++) {
            if(aaa[i] % 2 ==1 && i %2 ==0){
                n+=1;
            }
        }
        System.out.println(n);
    }


}
