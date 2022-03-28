package com.doit.wait;
/*
    wait方法会将锁归还,且需要用监视器调用
    sleep方法不会将锁归还,静态方法哪里都可以调用
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        //obj类型的方法,必须在监视器(锁)内使用
        Object obj = new Object();
        Thread t = new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("开始等待");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

       t.start();

        Thread.sleep(3000);
        System.out.println("准备唤醒..");
        synchronized (obj){
            obj.notify();
        }
        System.out.println("已经唤醒");

    }
}
