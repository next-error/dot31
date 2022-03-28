package com.doit.demo_Annotation;

import java.lang.annotation.Annotation;
//注解位置:作用在类上
@myAnnotation1(name = "aa",age = 22,c=String.class,arr="sss")
public class Test {
    public static void main(String[] args) {
        //获取注解位置的字节码文件,这里是Test类的字节码文件
        Class<Test> c = Test.class;
        //判断类上是否含有注解
        boolean b = c.isAnnotationPresent(myAnnotation1.class);
        //System.out.println(b);
        //若含有注解,则取出注解内容
        if (b) {
            myAnnotation1 annotation = c.getAnnotation(myAnnotation1.class);
            String name = annotation.name();
            int age = annotation.age();
            Class c1 = annotation.c();
            String[] arr = annotation.arr();

        }
    }
}
