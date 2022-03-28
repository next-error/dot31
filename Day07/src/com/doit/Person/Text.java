package com.doit.Person;

import com.doit.Person.Person;

public class Text {
    public static void main(String[] args) {
/*        Person p = new Person();
        p.name = "宝玉";
        p.age = 15;
        p.eat();
        //p.sleep();
        Person p2 = new Person();
        p2.name = "黛玉";
        p2.age = 15;
        p2.eat();
        //p2.sleep();*/
        Person p1 = new Person(13,"大黄",'男',true);
/*        p1.setAge(45);
        p1.setName("打爆");
        p1.setSex('男');
        p1.setLoveJava(true);*/
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        System.out.println(p1.getSex());
        System.out.println(p1.isLoveJava());

    }
}
