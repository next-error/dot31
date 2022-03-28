package com.doit.ArrAylist;

import com.doit.lei.Person;

import java.util.ArrayList;
import java.util.Random;
import  java.*;
/*
集合的特点:
集合可以存储任意长度数据
集合只可以存储引用类型的数据---存储的内容为地址
    若要存储基本类型的数据,需要写其对应的包装类型
创建集合:
  ArrayList <集合储存的数据类型> 集合名 = ArrayList <>();
 */

public class Arraylist_InClass {
    public static void main(String[] args) {
/*        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(13);
        list1.add(15);
        System.out.println(list1.get(1));
        System.out.println(list1.size());
        System.out.println("++++++++++++++++++++++++++++");
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('a');
        list2.add('D');
        list2.add('F');
        list2.add('好');
        System.out.println(list2.get(1));
        System.out.println(list2.size());
        System.out.println("_________________________________");
        ArrayList<Float> list3 = new ArrayList<>();
        list3.add(3.14f);
        list3.add(1.25f);
        System.out.println(list3.get(1));

        ArrayList<Long> list4 = new ArrayList<>();
        list4.add(100000000000L);
        System.out.println(list4.get(0));
        ArrayList<Boolean> list5 = new ArrayList<>();
        list5.add(true);
        list5.add(false);
        list5.add(true);
        System.out.println(list5.get(1));

        ArrayList<String>  list6 = new ArrayList<>();
        list6.add("I");
        list6.add("lOVE");
        list6.add("Java");
        String s = list6.get(0)+" "+list6.get(1)+" "+list6.get(2);
        System.out.println(s);

        ArrayList<Random> list8 = new ArrayList<>();
        Random ra = new Random();
        Random ra1 = new Random();
        list8.add(ra);
        list8.add(ra1);

        ArrayList<Car> list7 = new ArrayList<>();
        Car ci = new Car();
        ci.price = 1000;
        list7.add(ci);
// 集合遍历
        for (int i = 0; i < list8.size(); i++) {
            Random a = list8.get(i);
            System.out.println(a);*/
//        }
        //打印 类集合中
        ArrayList <Car> p_list=new ArrayList<>();
        Car c1 =new Car();
        c1.price = 100000;
        p_list.add(c1);
        System.out.println(c1.price);
        Car c2 =new Car();
        c2.price = 200000;
        p_list.add(c2);
        System.out.println(c2.price);
        Car c3 =new Car();
        c3.price = 300000;
        p_list.add(c3);
        System.out.println(c3.price);
        for (int i = 0; i < p_list.size(); i++) {
            Car cc = new Car();
            cc = p_list.get(i);
            System.out.println(cc.price);
        }

    }
}
