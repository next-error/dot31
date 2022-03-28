package com.doit.Product_Costomer;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Lock l = new ReentrantLock();
        Condition con1 = l.newCondition();
        Condition con2 = l.newCondition();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                l.lock();
                if (arr.size()!=0) {
                    try {
                        con1.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                arr.add("aaa");
                System.out.println(arr);
                con2.signal();
                l.unlock();

            }}
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                l.lock();
                if (arr.size()==0) {
                    try {
                        con2.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                arr.remove(0);
                System.out.println(arr);
                con1.signal();
                l.unlock();
            }
            }
        });
        t2.start();
    }
}
