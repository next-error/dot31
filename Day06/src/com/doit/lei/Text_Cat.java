package com.doit.lei;

public class Text_Cat {
    public static void main(String[] args) {
        //创建对象
        Cat c1 = new Cat();
        //为c1对象赋值
        c1.name = "妙妙";
        c1.age = 1.5;
        c1.pingzhong = "英短";
        c1.huase = "银渐层";
        System.out.println(c1.name);
        System.out.println(c1.age);
        System.out.println(c1.pingzhong);
        System.out.println(c1.huase);
        System.out.println("+++++++++++++++++++++++");
        //创建对象
        Cat c2 = new Cat();
        //为c2对象赋值
        c2.name = "花花";
        c2.age = 2;
        c2.pingzhong = "布偶";
        c2.huase = "白色";
        System.out.println(c2.name);
        System.out.println(c2.age);
        System.out.println(c2.pingzhong);
        System.out.println(c2.huase);
    }
}
