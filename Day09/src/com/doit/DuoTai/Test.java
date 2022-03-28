package com.doit.DuoTai;

public class Test {
    public static void main(String[] args) {





        /*Person p = new Student();
        p.eat();//有重写标记,是子类重写的方法
        System.out.println(p.age);//多态后成员变量访问的是父类的
        System.out.println(p.name);
        p.play();//父类方法*/

        Annimal a = new Cat();
        a.sleep();
        System.out.println(a.age);

        Fly f =new Bird();
        f.fly();
        System.out.println(Fly.age);


    }
}
