package com.doit.Runnable.syschronized;
/*
线程同步之同步代码块
 */
public class test {
    public static void main(String[] args) {
        tickets ti = new tickets();
        Thread th1 = new Thread(ti);
        Thread th2 = new Thread(ti);
        Thread th3 = new Thread(ti);
/*        th1.start();
        th2.start();
        th3.start();*/

        Tickets_method tm =new Tickets_method();
        Thread t1 = new Thread(tm);
        Thread t2 = new Thread(tm);
        Thread t3 = new Thread(tm);
        t1.start();
        t2.start();
        t3.start();

    }
}
