package com.doit.join;

public class Test01 {
    public static void main(String[] args) {
        myRunnable myRunnable = new myRunnable();
        Thread t3 = new Thread(myRunnable);
        t3.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main:"+i);
        }
    }
}
