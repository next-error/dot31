package com.doit.demo_Class;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class demo {
    /*
    public class Person --(javac编译后) -->Person.class字节码文件 --java.lang.Class
     */
    //三种方式创建Class对象
    public static void main(String[] args) throws Exception, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //方式2
        Class c2  = Class.forName("java.util.ArrayList");
        System.out.println(c2);


        //方式1
        Properties p = new Properties();
        Reader r = new FileReader("Day24\\class_name\\classname.properties");
        p.load(r);
        r.close();
        String classname = p.getProperty("className");
        //System.out.println(classname);
        //method(classname);

        System.out.println(c2.getName());//获取类名
        System.out.println(c2.getCanonicalName());
        Constructor con = c2.getConstructor();
        System.out.println(con);//public java.util.ArrayList()  空参构造
        Constructor[] cons = c2.getConstructors();
        for (Constructor constructor : cons) {
            System.out.println(constructor);

        }
        Object o = con.newInstance();//运行空参构造
        System.out.println(o);
        Constructor con2 = c2.getConstructor(int.class);//运行带参构造
        Object o1 = con2.newInstance(3);
        System.out.println(o1);
        //运行带参构造
        Constructor constructor = method(classname).getConstructor(String.class,int.class);
        Object obj = constructor.newInstance("张三",13);
        System.out.println(obj);
        //运行私有的构造方法
        Class[] declaredClasses = method(classname).getDeclaredClasses();//获取所有的构造方法
        for (Class declaredClass : declaredClasses) {
            System.out.println(declaredClass);
        }

    }
    public static Class method(String className) throws ClassNotFoundException {
        Class<?> c1 = Class.forName(className);
        return c1;
    }
}
