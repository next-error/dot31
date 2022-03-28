package com.doit.InterFace_JDK1;

public interface Fly {
    //默认方法  接口一般不可以定义方法体,它默认方法是abstract 但默认方法可以,而且子类可以选择是否重写
    public default void method1 (){
        System.out.println("默认方法");
    }
    //静态方法
    public static void method2(){
        System.out.println("静态方法");
    }
}
