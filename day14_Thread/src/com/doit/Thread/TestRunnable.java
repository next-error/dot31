package com.doit.Thread;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在看代码..."+i);
        }
    }
    //main线程  主线程
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TestRunnable testRunnable =new TestRunnable();
        //创建线程对象,通过线程对象来开启我们的线程 代理
        Thread thread =new Thread(testRunnable);
        thread.start();


        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程..."+i);
        }
    }

}
