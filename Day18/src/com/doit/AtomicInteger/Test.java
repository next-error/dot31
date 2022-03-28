package com.doit.AtomicInteger;

public class Test {
    public static volatile boolean flag = true;
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1号线程启动....执行while循环");
                long num = 0;

                while(flag){
                    num++;
                }
                System.out.println(num);
            }
        }).start();
        Thread.sleep(2000);
        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("2号线程启动....修改flag的值为false,停止循环");
                flag = false;
            }
        }).start();
    }
}
