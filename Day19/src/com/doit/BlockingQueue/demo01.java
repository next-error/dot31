package com.doit.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class demo01 {
    /*
    方法:
        add:满了添加会抛异常
        offer:满了添加返回false,加不进去
        put: 满了会阻塞该线程
        take:获取并移除头部元素
    实现类:
        ArrayBlockQueue: 需要指定长度
        LinkedBlockingQueue:默认长度为Integer.MaxValue,可以指定长度
        SynchronousQueue:没有长度,put完了要等待take
     */
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bl = new ArrayBlockingQueue<String>(10);
        bl.add("aaa");//不满添加返回true,满了再添加抛异常
        bl.add("bbb");
        bl.add("ccc");
        bl.offer("eee");//不满添加返回true,满了再添加返回false
        bl.offer("fff");
        bl.put("ggg");//满了再添加阻塞(等待)
        String take = bl.take();
        System.out.println(take);
        System.out.println(bl);
        System.out.println(bl.take());
        System.out.println(bl);        System.out.println(bl.take());
        System.out.println(bl);        System.out.println(bl.take());
        System.out.println(bl);        System.out.println(bl.take());
        System.out.println(bl);
        BlockingQueue<String> bl1 = new LinkedBlockingQueue<>();
        bl1.put("aaa");
        System.out.println(bl1.take());//要用其他线程去take


    }
}
