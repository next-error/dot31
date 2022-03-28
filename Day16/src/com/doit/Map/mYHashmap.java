package com.doit.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class mYHashmap {
    public static void main(String[] args) {
        HashMap<Person,String> hashMap = new HashMap<>();
        hashMap.put(new Person(12,"fed"),"beijing");
        hashMap.put(new Person(13,"fed1"),"shanghai");
        hashMap.put(new Person(14,"fed2"),"gaungzhou");
        hashMap.put(new Person(15,"fed3"),"shenzhen");
        System.out.println(hashMap);
        Set<Map.Entry<Person, String>> entry1 = hashMap.entrySet();
        for (Map.Entry<Person, String> en :entry1){
            String value = en.getValue();
            Person key = en.getKey();
            System.out.println(key.getAge()+"-"+key.getName()+"="+value);

        }
    }


}
