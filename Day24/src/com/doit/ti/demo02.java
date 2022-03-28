package com.doit.ti;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Properties;

public class demo02 {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();
        Reader r = new FileReader("Day24\\class_name\\classname.properties");
        p.load(r);
        r.close();
        String className = p.getProperty("className");
        String methodName = p.getProperty("methodName");
        show(className,methodName);
    }
    public static void show(String classname,String methodname) throws Exception {
        //创建Class对象
        Class<?> c = Class.forName(classname);
        //创建对象调用方法
        Object o = c.newInstance();
        Method method = c.getMethod(methodname);
        method.invoke(o);

    }
}
