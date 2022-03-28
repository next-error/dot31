package com.doit.DaiMaKuai;
/*
代码块执行顺序
静态代码块 > 成员代码块
父类代码块 > 子类代码块
执行时点:
创造对象(本类或子类)
调用静态成员变量或方法(子类琥珀

 */
public class Person {
    {
        System.out.println("成员代码块");
    }
    static {
        System.out.println("静态代码块");
    }
}
