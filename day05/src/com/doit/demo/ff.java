package com.doit.demo;

public class ff { public static void main(String[] args) {
    //定义不同数据类型的变量
    byte a = 10;
    byte b = 20;
    short c = 10;
    short d = 20;
    int e = 10;
    int f = 10;
    long g = 10;
    long h = 20;
    // 调用
    System.out.println(compare(a, b));
    System.out.println(compare(c, d));
    System.out.println(compare(e, f));
    System.out.println(compare(g, h));
    int [] arr = {1,2,3,45,6};
    bianLi(arr);
    System.out.println("________");
    System.out.println(max(arr));
    System.out.println(arrToString(arr));

}

    // 两个byte类型的
    public static boolean compare(byte a, byte b) {
        System.out.println("byte");
        return a == b;
    }

    // 两个short类型的
    public static boolean compare(short a, short b) {
        System.out.println("short");
        return a == b;
    }

    // 两个int类型的
    public static boolean compare(int a, int b) {
        System.out.println("int");
        return a == b;
    }

    // 两个long类型的
    public static boolean compare(long a, long b) {
        System.out.println("long");
        return a == b;
    }
    // 数组作为方法参数
    public static void bianLi (int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int max(int [] a){
    int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i]>max) {
                max=a[i];
            }
        }return max;
    }
    public  static  String arrToString (int [] arr){
    String s ="[";
        for (int i = 0; i < arr.length; i++) {
            //s+=arr[i];
            if (i==arr.length-1) {
                s+=arr[i]+"]";
            }else {
                s+=arr[i]+",";
            }
        }return s;
    }
}

