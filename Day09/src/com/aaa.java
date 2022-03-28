package com;

public class aaa {
    public static void main(String[] args) {
        long t1 =System.currentTimeMillis();
        System.out.println(f(100));
        long t2 = System.currentTimeMillis();
        long t3 =t2-t1;
        System.out.println(t3);
    }
    public static int f(int x){
        if (x==0) {
            return 0;
        }else {
            System.out.println(f(x-1));
            return 2*f(x-1)+x*x;

        }
    }


}
