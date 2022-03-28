package com.doit.ThreadPool;

public class MyRunnable implements Runnable{
    private int num;
    public MyRunnable(int num){
        this.num=num;
    }
/*    @Override
    public void run(int num) {
        int sum =0;
        for (int i = 0; i < num; i++) {
            sum+=i;
        }


    }*/

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行了第"+num+"条线程");
    }
}
