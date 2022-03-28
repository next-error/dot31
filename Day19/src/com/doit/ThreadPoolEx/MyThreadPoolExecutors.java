package com.doit.ThreadPoolEx;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
构造方法字段解析: 主线程数, 最大线程数(主线程数+临时线程数), 临时线程最大空闲时间,  阻塞队列  线程工厂,  拒绝策略
执行流程: 主线程--->阻塞队列--->临时线程--->拒绝策略
        拒绝策略:
                1. ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常；也是默认的处理方式。
                2. ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常。
                3. ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
                4. ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务

 */
public class MyThreadPoolExecutors {

    public static void main(String[] args) throws InterruptedException {

        ThreadPoolExecutor th1 = new ThreadPoolExecutor(2, 3, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory());

        Lock l = new ReentrantLock();
        Condition c1 = l.newCondition();

        th1.submit(new Runnable() {
            @Override
            public void run() {
                l.lock();
                try {
                    c1.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "执行了");


                }
                l.unlock();
            }
        });
        Thread.sleep(3000);
        l.lock();
        c1.signal();
        l.unlock();
    }


}
