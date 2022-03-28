package com.doit.Thread1;
//多个线程同时操作一个对象
//出现两个人拿到同一张票的情况,线程不安全
public class Tickets implements Runnable{
    private int tickets_Num=10;
    @Override
    public void run() {
        while (true){
            if (tickets_Num<=0) {
                break;
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+tickets_Num--+"票");
        }
    }

    public static void main(String[] args) {
        //接口实现类对象
        Tickets tickets =new Tickets();

         new Thread(tickets,"小明").start();
         new Thread(tickets,"小红").start();
         new Thread(tickets,"黄牛").start();

    }
}
