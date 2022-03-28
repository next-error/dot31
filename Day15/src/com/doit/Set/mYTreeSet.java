package com.doit.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*
传入自定义类型需要排序,只有当比较的结果不同时,数据才可以添加进去
两种排序方法都可以,返回值为0代表相同,此时不会向集合中添加元素
 */
public class mYTreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Person(12, "AA"));
        set.add(new Person(13, "sfgA"));
        set.add(new Person(132, "sshtAA"));
        set.add(new Person(5, "qqAA"));
        set.add(new Person(5, "qrgreqAA"));
        System.out.println(set);

        System.out.println("__________________________________");

        Set set1 =new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age-o1.age;
            }
        });
        set1.add(new Person(12, "AA"));
        set1.add(new Person(13, "sfgA"));
        set1.add(new Person(132, "sshtAA"));
        System.out.println(set1);
    }

}
