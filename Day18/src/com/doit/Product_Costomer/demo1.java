package com.doit.Product_Costomer;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) throws InterruptedException {
        //整体思路,通过控制集合中元素的有无来判定谁处于等待中,没当一个线程执行完毕就唤醒另一个等待的线程

        //创建集合及监视器对象
        ArrayList<String> arr = new ArrayList();
        Object obj = new Object();

        //创建生产线程
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){                synchronized (obj){
                    //判断集合中有没有元素,有就等着
                    if (arr.size() !=0) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //如果没有元素,添加
                    arr.add("aaa");
                    System.out.println("生产线程添加:"+arr);
                    //唤醒
                    obj.notify();
                }}

            }
        });
        t1.start();
        Thread.sleep(1000);
        //消费线程
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){                synchronized (obj){
                    //判断有没有元素,没有就等着
                    if (arr.size()==0) {
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    //有元素则获取并删除
                    String r1 = arr.remove(0);
                    System.out.println("消费获取:"+r1);
                    System.out.println("消费后arr:"+arr);
                    obj.notify();
                }}

            }
        });
        t2.start();

    }
}
