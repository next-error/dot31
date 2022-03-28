package com.doit.Animal;

public class Dog extends Animal implements LookDoor{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sleep(){
        System.out.println("狗趴着睡");
    }

    @Override
    public void watchDoor() {
        System.out.println("狗看门");
    }
}
