package com.doit.Product_Costomer;

public class Test {

    //使用同步方法获取flag的值
    public static synchronized boolean getFlag(){
        return flag;
    }

    public static  boolean flag = true;
    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1号线程启动....执行while循环");
                long num = 0;
                    /*
                        线程调用getFlag方法时 先获取锁 也就是加锁
                        这时会先清空本地内存中共享副本的值,那么在使用值就需要从
                        主内存中重新获取 ,线程释放锁时,也就是解锁,会把共享变量flag
                        的值重新更新到主内存中
                     */
                while(getFlag()){
                    num++;
                }
                System.out.println(num);
            }
        }).start();

        Thread.sleep(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {

                System.out.println("2号线程启动....修改flag的值为false,停止循环");
                flag = false;
            }
        }).start();
    }
}