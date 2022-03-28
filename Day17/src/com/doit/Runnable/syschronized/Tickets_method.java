package com.doit.Runnable.syschronized;

public class Tickets_method implements Runnable
{
    private static int tickets=100;

    @Override
    public void run() {
      //  sell1();
        sell12();
    }
    //此方法就是自定义方法,方法内再用synchronized代码块包装起来,此时锁是this
    public synchronized void sell1 () {
        while (tickets > 0) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "买了第" + tickets + "票");
                tickets--;
            }
        }
    }
//可以采用静态,此时锁为类名.class
        public static synchronized void sell12() {
            while (tickets > 0) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + "买了第" + tickets + "票");
                    tickets--;
                }
            }
        }

}
