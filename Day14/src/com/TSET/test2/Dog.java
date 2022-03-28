package com.TSET.test2;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void sleep() {
        System.out.println("狗趴着睡");
    }
    public void look_Door(){
        System.out.println("狗看门");
    }
}
