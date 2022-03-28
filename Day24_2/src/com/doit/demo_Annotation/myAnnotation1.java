package com.doit.demo_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
注解:可以用注解代替原来的.properties文件使用
使用流程:
1.定义注解
2.获取注解内容的反射对象
3.判断是否使用注解
4.获取注解内容

//定义注解
元注解: -修饰注解的注解  指定注解的生命周期 注解位置等
@Retention 指定注解的生命周期
    RUNTIME:存在于java源代码 编译后字节码文件 及运行时内存中,和反射联合使用
    CLASS:默认注解周期,存在于java源代码及编译后的字节码文件中,运行时不会出现在内存中
    SOURCE:只存在于java的源代码中,编译的字节码文件中不存在
@Target  指定注解的使用位置
    TYPE:  用在类 接口上
    FIELD: 用在成员变量上
    METHOD:用在成员方法上
    PARAMETER: 用在参数上
    CONSTRUCTOR：用在构造方法上
    LOCAL_VARIABLE：用在局部变量上


//判断是否使用注解 及 获取注解内容
AnnotatedElement:接口    实现类: Class, Constructor, Field, Method AccessibleObject 
    boolean isAnnotationPresent(Class<? extends Annotation> annotationClass)
        annotationClass- 对应于注释类型的 Class 对象
    <A extends Annotation> A getAnnotation(Class<A> annotationClass)
          如果存在该元素的指定类型A的注释，则返回这些注释，否则返回 null。
 */
@Retention(RetentionPolicy.RUNTIME)//运行时
@Target(ElementType.TYPE)//类注解
public @interface myAnnotation1 {
    public abstract String name() ;
    public abstract int age();
    public abstract  Class c();
    public abstract String [] arr();
}
