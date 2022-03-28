package com.doit.AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class demo01 {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        System.out.println(ai);
        AtomicInteger ai1 = new AtomicInteger(12);
        System.out.println(ai1);//12
        ai.addAndGet(15);
        System.out.println(ai);//加15再用
ai.getAndIncrement()  ;//ai++ --16
       ai.incrementAndGet();//++ai ---17
       ai.decrementAndGet() ;//--ai,  ---16
        int aaa = ai.getAndSet(1);
        System.out.println(aaa);//16
        System.out.println(ai);//1



    }
}
