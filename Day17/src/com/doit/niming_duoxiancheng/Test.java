package com.doit.niming_duoxiancheng;

public class Test {
    public static void main(String[] args) {
        //方式1
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    //System.out.println(this.getName()+"-"+i);
                    System.out.println(Thread.currentThread().getName() + "+" + i);
                }
            }

        };
        t1.start();

        //方式2
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    //System.out.println(this.getName()+"-"+i);
                    System.out.println(Thread.currentThread().getName() + "+" + i);
                }
            }
        };
        new Thread(r1).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    //System.out.println(this.getName()+"-"+i);
                    System.out.println(Thread.currentThread().getName() + "+" + i);
                }
            }
        });
    }
}
