package com.doit.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class deni01 {
    public static void main(String[] args) {
        /*
        add
        celar
        remove
        size
        toarray

         */
        Collection<String> list =new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.remove("c");
        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains("a"));
        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);//直接打印obj调用object的toString方法,打印地址值,obj中的元素为String类型

        }
        System.out.println("___________________________________________");
        String [] strings=list.toArray(new String[5]);
        System.out.println(strings.length);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}
