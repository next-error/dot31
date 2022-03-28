package com.doit.Thread;
/*
静态调用非静态

 */
public class myThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.getName()+"-"+i);
            System.out.println(Thread.currentThread().getName()+"+"+i);
        }
    }
}
