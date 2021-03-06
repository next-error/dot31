package com.doit.bean;

import java.util.Objects;

public class Person {
    private String name;
    private  int age;
    public Person() {
    }
    public Person(String name,int age){
        this.name = name;
        this.age=age;
    }
    private Person(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
