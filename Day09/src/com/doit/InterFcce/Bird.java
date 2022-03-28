package com.doit.InterFcce;

public class Bird implements Fly{
    @Override
    public void open() {
        System.out.println("张开翅膀");
    }

    @Override
    public void fly() {
        System.out.println("飞");

    }
}
