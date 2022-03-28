package com.doit.Set;

import java.util.*;

public class demo01 {
    public static void main(String[] args) {
        Set<String>  set =new HashSet<>();//无序
        set=new TreeSet<>();//排序
        set = new LinkedHashSet<>(); //有序
        set.add("aaa");
        set.add("abd");
        set.add("vfr");
        set.add("grf");

        System.out.println(set);
//迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        //增强for
        System.out.println("=========================");
        for (String s:set){
            System.out.println(s);
        }
    }
}
