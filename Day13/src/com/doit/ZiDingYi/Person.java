package com.doit.ZiDingYi;

public class Person {
    private  int age ;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NoAgeExpection {
         if (age<0 ||age>200) {
            throw new NoAgeExpection("年龄不合法");
        }
        this.age = age;
    }
}
