package com.doit.Priority;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"##"+i);
                }
            }
        };
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getName()+"##"+i);
                }
            }
        };
        Thread t2 =new Thread(r1);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        //new Thread(r1).start();
    }
}
