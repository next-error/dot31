package com.TSET.test10;

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NoAgeException {
         if (age<0 ||age>200) {
            throw new NoAgeException("年龄输入有误");
        }
        this.age = age;
    }
}
