package com.doit.lock;

public class test {
    public static void main(String[] args) {
        tickets tt =new tickets();
        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt);
        Thread t3 = new Thread(tt);
        t1.start();
        t2.start();
        t3.start();
    }
}
