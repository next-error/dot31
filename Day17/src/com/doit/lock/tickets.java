package com.doit.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class tickets implements Runnable{
    private int tickets =100;
    private Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (tickets>0){
            if (tickets>0){
                l.lock();
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+"买了第"+tickets+"");
                    tickets--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    l.unlock();
                }
            }


        }
    }
}
