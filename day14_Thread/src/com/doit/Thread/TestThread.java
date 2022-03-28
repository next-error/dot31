package com.doit.Thread;
//创建线程方式一:继承Thread. 重写run方法,调用start方法
public class TestThread extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000; i++) {
            System.out.println("我在看代码..."+i);
        }
    }
//main线程  主线程
    public static void main(String[] args) {
        //创建一个线程对象
        TestThread testThread = new TestThread();
        //调用start方法
        testThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("我在学习多线程..."+i);
        }
    }
}
