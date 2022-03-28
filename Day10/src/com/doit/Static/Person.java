package com.doit.Static;

public class Person {
    private static int a = 120;
    String name ;

    public static int getA() {
        return a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setA(int a) {
        Person.a = a;
    }
}
