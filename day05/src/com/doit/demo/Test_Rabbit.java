package com.doit.demo;
/*
題目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一
对兔子，假如兔子都不死，问每个月的兔子总数为多少？
1:2
2:2
3:2+2
4:4+2
5:6+2
6:8+4
 */
public class Test_Rabbit {
    public static void main(String[] args) {
    rabbit_Num(11);
    }
    public static void rabbit_Num (int month){
    int months = 1;
    int rabbit_num = 2;
    int count_fan = 0;//可以剩余的兔子对数
        for (int i = 1; i <= month; i++) {
           count_fan = i/3;
                rabbit_num+=count_fan*2;

            System.out.println(i+"个月时可以生育的兔子对数:"+count_fan);
            System.out.println("第"+i+"个月时兔子的数量为:"+rabbit_num);
        }
    }
}
