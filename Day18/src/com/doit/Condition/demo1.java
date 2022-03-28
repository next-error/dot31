package com.doit.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        Lock l = new ReentrantLock();
        Condition con  = l.newCondition();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开始等待");
               l.lock();
                try {
                    con.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("已经唤醒");
                l.unlock();
            }
        });
        t1.start();
        Thread.sleep(3000);
        l.lock();
        System.out.println("准备唤醒");
        con.signal();
        l.unlock();
    }
}
