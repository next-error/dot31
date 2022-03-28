package com.doit.Animal;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Test {
    public static void main(String[] args) {
        Dog g = new Dog();
        g.sleep();
        g.eat();
        g.watchDoor();
        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.zhua();
    }
}
