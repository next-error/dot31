package com.doit.demo_Class;

import java.lang.reflect.Method;

public class demo01 {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("com.doit.bean.Person");
        //运行方法
        /*
        getMethod 获取public修饰的方法,包括继承
        getDeclaredMethod  获取私有构造方法,但不包含继承
         */
        //快捷方式创建空参构造对象
        Object o = c.newInstance();

        Method setName = c.getMethod("setName", String.class);
        setName.invoke(o,"张三");
        System.out.println(o);

        Method setAge = c.getDeclaredMethod("setAge", int.class);
        setAge.invoke(o,14);
        System.out.println(o);

        Method[] methods = c.getMethods();
/*        for (Method method : methods) {
            System.out.println(method);
        }*/
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }

    }
}
