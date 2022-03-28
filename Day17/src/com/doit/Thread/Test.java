package com.doit.Thread;
/*
Thread 方法
    getname:非静态,创建对象调用,返回String类型
    setname:非静态,创建对象调用
    currentThread:静态方法,获取当前对象
 */
public class Test {
    public static void main(String[] args) {
        myThread mt = new myThread();
        mt.setName("大黄");
        mt.start();
        myThread mt1 =new myThread();
        mt1.start();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"-"+i);
        }
    }
}
