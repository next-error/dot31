package com.doit.NIMING;

public class Test {
    public static void main(String[] args) {
        //匿名内部类.既是类又是对象
        Fly f =new Fly(){
            @Override
            public  void open() {
                System.out.println("张开翅膀");
            }
            @Override
            public void fly() {
                    System.out.println("上天了");
            }

            @Override
            public void close() {
                    System.out.println("安全着陆");
            }
        };
        f.fly();
        f.close();
    }
}
