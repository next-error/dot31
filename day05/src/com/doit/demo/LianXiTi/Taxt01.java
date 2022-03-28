package com.doit.demo.LianXiTi;

import java.util.Random;

public class Taxt01 {
    public static void main(String[] args) {
        /*
        随机生成10个1-10之间的数（包括1和10），将生成的数放到数组中，计算数组中索引为奇数的元素平均值，并将结果打印到控制台上
         */
        int [] array = new int[10];
        Random ra = new Random();
        int sum = 0;
        int count = 0;
        //向数组中添加随机数
        for (int i = 0; i < array.length; i++) {

            int a = ra.nextInt(10)+1;
            array[i] = a;
            //System.out.println("这是第"+i+"个元素,值为:"+array[i]);
            //判断奇数索引,加入sum
            if (i % 2 ==1){
                sum += array[i];
                count++;
                //System.out.println("这是第"+i+"个元素,值为:"+array[i]);
            }
        }
        System.out.println(count);
        System.out.println(sum / count);

    }
}
