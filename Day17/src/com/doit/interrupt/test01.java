package com.doit.interrupt;

public class test01 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    System.out.println("s1:"+i);
                    boolean b = Thread.currentThread().isInterrupted();//接收到中断信号,再来判断进程怎么结束
                    System.out.println(b);
                    if (b) {
                        break;
                    }
                }
            }
        });
        t1.start();
        Thread.sleep(20);
        t1.interrupt();//发出中断信号,用isinterrupt接收
        //t1.stop();
    }
}
