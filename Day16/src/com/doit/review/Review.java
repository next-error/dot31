package com.doit.review;

import java.util.LinkedHashSet;

//泛型的传入?啥时候需要传入,啥时候不需要
public class Review {
    /*
    哈希表:
    linkedhashtreeset:继承自hashtreeset
    单列集合总结 :特点+方法+迭代
    map:map是接口! 下面三个类实现了此接口
        键唯一,与set不同之处在于键相同时,可以覆盖value
        基础方法:containsKey  put   get  返回值...
        遍历1: keyset方法获取key的set集合,再通过迭代器(增强for)遍历   这里返回的set集合需要用泛型指定其类型
        遍历2: entryset获得map集合的映射关系,调用其getkey及getvalue方法,通过迭代器(增强for)遍历
              entry是map里的内部接口,且需要用范磊指定其类型

        treemap:排序,key不可以存null值 自定义类型需要实现自然顺序接口conparable,重写conparato方法
                或者创建对象传入比较器,重写
                方法:
        hashmap:无序,null?
                自定义类型需要重写equals和hashcode方法
        linkedhashtree:继承自hashmap ,有序 null?
                ....
        //小练习:判断一个字符串每个字符的个数
 ***忘记**** Properties:
                特点:
                    实现了map接口
                    没有泛型,key和value都是String
                    唯一一个可以和IO流直接结合使用的集合
                使用:
                    setProperty: ---------添加元素
                    getProperty: ---------根据key获取value
                    stringPropertyNames:  获得所有键的set集合
 *****忘记**** 可变参数:
                    变量类型...变量名
                    相当于是一个数组,在方法中使用,只能使用一次,要放在最后
                    实例:
                        Collections
                        public static <T> boolean addAll(Collection<T> c, T... elements):往集合中添加一些元素。

    //斗地主案例
    多线程: 创建Theard的子类,写run方法 ,main方法创建对象调用start方法

     */
    public static void main(String[] args) {
        /*
        linkdhashset
         */
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

    }
}


//添加键值对  如果没有相同的键 则正常添加 有相同键时 值不会覆盖
//        map.putIfAbsent("aaa",100);
//        Integer v = map.putIfAbsent("dalang", 1000);
//        System.out.println(v);
//        System.out.println(map);


//根据键找值 如果有对应的键 则返回对应的值 如果没有对应的键 则使用给定的默认值
//        Integer value = map.getOrDefault("liuyan2", 100);
//        System.out.println(value);