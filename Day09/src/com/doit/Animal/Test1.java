package com.doit.Animal;

public class Test1 {
    public static void main(String[] args) {
            EatAtHome h = new EatAtHome();
            //一切使用父类引用的地方都可以使用子类对象!!!

            h.eat(new Cat());
            h.eat(new Dog());

    LookDoor l =new Dog();
    l.watchDoor();
    //Pig p = new Pig();
        new Pig().watchDoor();
    }
}
