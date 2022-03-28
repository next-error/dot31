package com.doit.ToString;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        list.add("abc");
        list.add("def");
        list.add("g");
        System.out.println(list);
        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person());
        list1.add(new Person());
        System.out.println(list1);//打印地址值,因为Person类没有重写ToString方法
    }



}
