package com.doit.ti;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Class<?> c = Class.forName("java.util.ArrayList");
        //Class<? extends ArrayList> c = list.getClass();
        Method add = c.getMethod("add", Object.class);
        add.invoke(list,"aaa");
        System.out.println(list);


    }
}
