package com.doit.demo;

import java.util.Random;
import java.util.Scanner;

/*
方法:
    定义位置:方法定义在类中,各个方法同级别不可以在方法中定义方法
    定义格式: public static void 方法名(){方法体}
    方法调用: 方法之间可以互相调用,调用格式:方法名();
 */
public class KeTang05 {
    public static void main(String[] args) {
        //printHello();
        //ouShu();
        //shuiXianHua();
        //panJiOu();
        //juXing();
        //daXixiaoSuijI();
        //printJi(7);
        //printMax(2,7);
        //printSum(10);
        //sanJiao(5);
        //shuZu(2);
        //shuZu2(10);
        //System.out.println(fanLuRu());
       /* int [] arr=getShuzu();
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);*/
        //System.out.println(getMaxer(12,44));
       // System.out.println(getSum(100));
        //System.out.println(getJiOu(8));
        System.out.println(getJuXing(3,2));
/*        int a =4;
        double [] b= getRandom(a);
        for (int i = 0; i < a; i++) {
            System.out.println(b[i]);
        }*/
        //sum(10,2);

        }

    public  static  void printHello(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello world");
        }
    }
    public static void ouShu(){
        for (int i = 1; i < 101; i++) {
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }
    public static  void shuiXianHua(){
        for (int i = 100; i < 1000; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10;
            if (i == ge*ge*ge+shi*shi*shi+bai*bai*bai) {
                System.out.println(i);
            }
        }
    }
    public static void panJiOu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int r = sc.nextInt();
        if (r%2==0) {
            System.out.println("这个数是偶数");
        }else {
            System.out.println("这个数是奇数");
        }
    }
    public static void juXing(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void daXixiaoSuijI(){
        Random ra = new Random();
        int a = ra.nextInt(99)+1;
        int b = ra.nextInt(99)+1;
        System.out.println("a的值为"+a);
        System.out.println("b的值为"+b);
        if (a>b) {
            System.out.println("两个随机数的最大值为:"+a);
        }else {
            System.out.println("两个随机数的最大值为:"+b);
        }
    }
    public static void  printJi(int a){
        for (int i = 0; i <= a; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }

    }
    public static void printMax(double a,double b){
        System.out.println(a>b?a :b);
    }
    public static void printSum (int a){
        int sum = 0;
        for (int i = 0; i < a; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
    public static void sanJiao(int a){
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void shuZu(int a){
        int[] shuju= new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println(shuju[i]);
        }
    }
    public static void shuZu2(int a){
        Random ra = new Random();
        int[] shuzu2 = new int[a];
        System.out.print("[");
        for (int i = 0; i < a; i++) {
            int r = ra.nextInt(100)+1;
            shuzu2[i]= r;
            if(i<a-1){
            System.out.print(shuzu2[i]+",");
            }else {
                System.out.print(shuzu2[i]+"]");
            }
        }
    }
    //有返回值的方法
    public static int fanLuRu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int a =sc.nextInt();
        return a;
    }
    public static  String fanZiFu (){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入如一个字符:");
        String a = sc.next();
        return sc.next();
    }

    public static int[] getShuzu (){
        //把水仙花数存进数组
        int [] arr=new int[4];
        int count =0;
        for (int i = 100; i <1000 ; i++) {
            int ge = i%10;
            int shi = i/10%10;
            int bai =i/100;
            if (i== ge*ge*ge+shi*shi*shi+bai*bai*bai){
                arr[count]=i;
                count++;
            }
        }return arr;
    }
    public static double getMaxer( double a,double b){
        return a>b? a:b;
    }
    public static int getSum(int n){
        int sum =0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }return sum;
    }
    public  static boolean getJiOu(int a){
        boolean bo;
        if (a%2==0) {
            bo =true;
        }else {bo = false;
        }return bo;
    }
    public  static String getJuXing (int m ,int n){
        String str="" ;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <=n ; j++) {
                str=str+"*";
            }str+="\r\n";
        }return str;
    }
    public static  double[] getRandom(int a){
        double [] shzu =new double[a];
        Random ra = new Random();
        for (int i = 0; i < a; i++) {
            double r =ra.nextDouble();
            shzu[i] = r;
        }return shzu;
    }
    //方法重载;在变量名相同的基础上
    //          1.参数的个数不同      open(int a,int b){} 与open(a){}
    //          2.参数的类型不同      open(int a, double b) 与
    //          3.不同类型的顺序不同   open(int a, double b) 与 open(double a, int b)
    public  static  void sum (int a,int b){

    }
    public static  void sum(double b,int a){

    }
}
