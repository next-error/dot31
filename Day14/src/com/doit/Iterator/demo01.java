package com.doit.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class demo01    {
    public static void main(String[] args) {
        /*
        Iterator 中有hasnext 和next方法,但他是抽象的,需要用它的实现类对象去调用
        Collection 接口中有Iterator方法,返回Iterator类型,它为抽象的,需要它的实现类去调用,则它的实现类必须重写Iterator方法,需要返回它Iterator的实现类
        返回的实现类再用iterator去接收,即可调用Iterator中的方法
         */
        Collection<String> a1 =new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        Iterator<String> it =a1.iterator();
        while (it.hasNext()){
           String s = it.next();
           System.out.println(s);
            //System.out.println(it.next());

        }
        //增强for
        for(String a: a1){
            System.out.println(a);
        }
/*        System.out.println("_______________________________");
        Collection <Person> c1 = new ArrayList<>();
        c1.add(new Person(12,"fe"));
        c1.add(new Person(13,"aa"));
        c1.add(new Person(14,"bb"));
        Iterator<Person> it1 =c1.iterator();
        while (it1.hasNext()){
          //Person person = it1.next();
          // System.out.println(person.getAge()+"  "+person.getName());
            System.out.println(it1.next().getAge()+"  "+it1.next().getName());
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        */Collection< Person> c2 = new ArrayList<>();
        c2.add(new Person(11,"柳岩"));
        c2.add(new Person(13,"唐嫣"));
        c2.add(new Person(15,"金莲"));
        c2.add(new Person(17,"大朗"));
        Iterator<Person> it2 = c2.iterator();
        while (it2.hasNext()){
            Person p3 = it2.next();
            //if (p3.getName().equals("金莲")) {
            //if ("柳岩".equals(p3.getName()) || 11==p3.getAge()) {


               // c2.add(new Person(11,"西门庆"));

            System.out.println(p3.getName());
        }

        //增强for
        for(Person p:c2){
             System.out.println(p.getAge()+" "+p.getName());
        }
        }

   // }
}
