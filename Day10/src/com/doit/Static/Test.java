package com.doit.Static;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("liuliyl");
        System.out.println(p1.getClass());
        System.out.println(p1.name.getClass());

        Person p2 = new Person();
        System.out.println(Person.getA());
        Person.setA(133333);
        System.out.println(Person.getA());
    }
}
