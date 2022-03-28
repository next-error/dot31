package com.TSET.test2;

public class Test {
    public static void main(String[] args) {
        Animal animal1 =new Cat();
        Home home =new Home();
        home.eat_home(animal1);
        Animal animal2 =new Dog();
        home.eat_home(animal2);
    }

}
