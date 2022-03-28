package com.doit.Test;

public class myRunnablet3 implements Runnable{
    @Override
    public void run() {

        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("t3:"+i);
        }
    }

    Thread t2 = new Thread(){
        @Override
        public void run() {
            t1.start();
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println("t2:"+i);
            }
        }
    };
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("t1:"+i);
            }
        }
    });



}
