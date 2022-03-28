package com.doit.review;

import java.util.*;

public class Collection_Summarize {
    /*
Iterable:位于Collection之上,最上层根接口 它的下面的实现类都可以用增强for
    Collection:接口---层次结构中的根接口(这里学到的是所有集合的根接口)
                //方法:add remove  get   clear  size  contains  toString  equals  isempty  hashcode
                      toArray:返回数组
                      iterator:迭代器方法,返回iterator接口的实现类对象  ***精妙之处****返回的对象用new Iterator接口去接收,多态!!!!
        List:接口---有序序列
                //特点:有索引 元素可重复  有序(添加顺序)
                //方法;indexOf:返回元素出现的索引,没有返回-1
                       listIterator:list特有迭代器,迭代同时可以进行增删操作
            Arraylist:实现类--底层是数组
                    //特点:增删慢,查询块
                    //构造方法:可以自定义集合长度


                    //方法:removeRange:在指定区域内移除所有元素,左闭右开
                          trimToSize:返回数组实际长度
            LinkedList:实现类---底层是链表
                    //特点:查询慢,增删快

        Set:


     */
    public static void main(String[] args) {
        Set<String> myset = new HashSet<>();
        Iterator<String> it = myset.iterator();

        ArrayList<String> list = new ArrayList<>(30);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        System.out.println(list.size());
        list.trimToSize();
        System.out.println(list.size());
/*        ListIterator<String> list_it = list.listIterator();
        while (list_it.hasNext()){
            String s = list_it.next();
            if (s.equals("bbb")) {
                list_it.add("111");
            }
            System.out.println(s);
        }
        System.out.println(list);*/


    }
}
