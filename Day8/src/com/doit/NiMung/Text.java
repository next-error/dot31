package com.doit.NiMung;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        // 匿名对象
            //Person P = method02();
    Person aa =new Person(12,"若菲儿");
        method01(aa);
        System.out.println(method02().getAge());
//方便为集合赋值及集合遍历
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(13,"ersha"));
        list.add(new Person(44,"ferd"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"  "+list.get(i).getAge());
        }
    }
    //
    public static void method01 (Person p){

    }
//
    public static   Person method02(){
        return new Person(12,"erbo");
    }

}
