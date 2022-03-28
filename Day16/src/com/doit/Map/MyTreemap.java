package com.doit.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MyTreemap {
    public static void main(String[] args) {
        TreeMap<Person,String> my_map= new TreeMap<>();
        my_map.put(new Person(12,"fed"),"beijing");
        my_map.put(new Person(13,"fed1"),"shanghai");
        my_map.put(new Person(14,"fed2"),"gaungzhou");
        my_map.put(new Person(15,"fed3"),"shenzhen");
        System.out.println(my_map);

        Person p1 = my_map.firstKey();
        System.out.println(p1);
        Map.Entry<Person, String> en_p2 = my_map.lastEntry();
        System.out.println(en_p2.getKey());
        System.out.println(en_p2.getValue());

       Person p3 = my_map.ceilingKey(new Person(4,"fd"));


        //比较器
/*        Map<Person,String> my_map1 =new TreeMap<>(Comparator<Person>);
        my_map1.put(new Person(12,"fed"),"beijing");
        my_map1.put(new Person(13,"fed1"),"shanghai");
        my_map1.put(new Person(14,"fed2"),"gaungzhou");
        my_map1.put(new Person(15,"fed3"),"shenzhen");
        System.out.println(my_map1);*/

    }
}