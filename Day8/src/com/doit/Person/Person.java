package com.doit.Person;

public class Person {
    private String name ="周杰伦";
    private int age;
    public Person() {
        System.out.println("Person的空参构造执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person的带参构造执行了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
