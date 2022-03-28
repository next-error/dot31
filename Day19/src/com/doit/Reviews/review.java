package com.doit.Reviews;

import java.util.concurrent.*;

public class review {
    /*
    线程池:一般创建的线程直接和操作系统交互
        创建线程池:ThreadPoolExecutor---ExecutorService的实现类;
                构造方法6个参数:主线程数,总线程数,临时线程空闲时长,临时线程空闲时长单位,阻塞队列,线程工厂,拒绝策略
                    三种阻塞队列:ArrayBlockingQueue  LinkedBlockingQueue  SynchronousQueue
                    四种拒绝策略:
                            1. ThreadPoolExecutor.AbortPolicy:丢弃任务并抛出RejectedExecutionException异常；也是默认的处理方式。
                            2. ThreadPoolExecutor.DiscardPolicy：丢弃任务，但是不抛出异常。
                            3. ThreadPoolExecutor.DiscardOldestPolicy：丢弃队列最前面的任务，然后重新尝试执行任务（重复此过程）
                            4. ThreadPoolExecutor.CallerRunsPolicy：由调用线程处理该任务

                方法:
                    submit:传参Runnable或Callable实现类对象,重写其方法
                            返回一个Future类型的数据(runnable返回null,callable有返回值)用future.get获取
                    shutdown:启动一次顺序关闭，执行以前提交的任务，但不接受新任务。

     */
    public static void main(String[] args) {
        ThreadPoolExecutor th = new ThreadPoolExecutor(3,3,60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory());
        th.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                return null;
            }
        });
    }
}
