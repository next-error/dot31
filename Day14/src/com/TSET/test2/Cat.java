package com.TSET.test2;

public class Cat extends Animal{
    @Override
    public void eat() {

        System.out.println("猫吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("猫躺着睡");
    }
    public void catch_mouse(){
        System.out.println("猫抓老鼠");
    }
}
