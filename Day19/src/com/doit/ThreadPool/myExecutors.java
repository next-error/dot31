package com.doit.ThreadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class myExecutors {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        for (int i = 1; i <= 10; i++) {
            pool.submit(new MyRunnable(i));
        }
        pool.shutdown();
        Future<Integer> f = pool.submit(new MyCallable(100));
        System.out.println(f.get());


    }
}
