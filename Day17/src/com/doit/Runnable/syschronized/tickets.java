package com.doit.Runnable.syschronized;

public class tickets implements Runnable{
    private  int tickets=100;
Object object =new Object();
    @Override
    public void run() {
        while(true){
            //synchronized (this){//这里要保证唯一性,一次只允许进来一个线程
            synchronized (object){//这里要保证唯一性,一次只允许进来一个线程
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (tickets>0) {
                    System.out.println(Thread.currentThread().getName()+"买到了第"+tickets+"张票");
                    tickets--;
                }
            }
        }


    }
}
