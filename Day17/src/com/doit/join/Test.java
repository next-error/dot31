package com.doit.join;

public class Test {
    myRunnable t3 = new myRunnable();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("t1:"+i);
                }
            }
        };
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("t2:"+i);
                }
            }
        });
        //t1.join();//这里t1尚未开始,t1 t2 和 main ,三个同时跑,不存在插队情况
        t1.start();
        //t1.join();//这里t1.join在main方法中执行的,t1插队main.t1执行完成后才会执行t2
        t2.start();
        t1.join();//这里t1和t2都开始跑了,t1插队main,存在两种可能:
                    //1.  t2比t1先跑完,t1跑完后main开始执行
                    //2.  t2比t1后跑完,t1跑完后,t2和main争着跑
        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
        }
        t1.join();//这里还是t1插队main
    }
}
