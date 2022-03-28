package com.doit.join;

public class myRunnable implements Runnable{
    @Override
    public void run() {
        try {
            t4.start();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("t3:"+i);
        }
    }
   Thread t4 = new Thread(){
       @Override
       public void run() {
           for (int i = 0; i < 10; i++) {
               System.out.println("t4:"+i);
           }
       }
   };
}
