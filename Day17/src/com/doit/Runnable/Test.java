package com.doit.Runnable;

public class Test {
    public static void main(String[] args) {
        myRunnable mu = new myRunnable();
        Thread t = new Thread(mu);
        t.setName("大黄");
        t.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
