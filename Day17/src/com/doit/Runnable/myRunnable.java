package com.doit.Runnable;

public class myRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            //System.out.println(this.getName()+"-"+i);
            System.out.println(Thread.currentThread().getName() + "+" + i);
        }
    }
}
