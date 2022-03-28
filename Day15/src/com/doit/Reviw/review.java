package com.doit.Reviw;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class review {
    /*
    自定义一个Arraylist
        创建对象时长度为0,add方法时判断是否需要扩容
        remove
        set
        isempty
        size
        迭代器实现:创建内部类实现接口
        tostring
   collections sort排序:要么实现compareable接口要么创建comparetor对象(比较器) 包装类的compare方法

    二叉树

    set:特点,没有索引,集合存储元素不可以重复
        treeset:底层采用红黑树,需要conparable或compator作比较,返回0表示添加元素与现存元素相同,无法添加 会自动排序
        hashset:底层采用了哈希表,用hashcode和equals比较元素是否相同,添加不重读元素

    linkArrayList;底层采用了双链表结构,主要方法是首尾元素操作,及push和pop

     */
    public static void main(String[] args) {
        //treeset:注意自定义类型要用泛型指定类型,注意double int String的对比方法
        //treeset集合采用comparable自然顺序接口对比
        Set set1 = new TreeSet();
        set1.add(new Animal("DA", 12));
        set1.add(new Animal("AA", 12));
        set1.add(new Animal("DA", 13));
        set1.add(new Animal("DA", 13));//没有添加进去
        System.out.println(set1);//[Animal{name='AA', age=12}, Animal{name='DA', age=12}, Animal{name='DA', age=13}]
        //treeset采用comparetor比较器对比
        Set set2 = new TreeSet(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                if (o1.getAge() == o2.getAge()) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getAge() - o2.getAge();
            }
        });


        //hashset

        Set set3 = new HashSet();
        set3.add(new Animal("hfg", 33));
        set3.add(new Animal("hfg", 34));
        set3.add(new Animal("fg", 33));
        set3.add(new Animal("hfg", 33));//未添加
        System.out.println(set3);//[Animal{name='fg', age=33}, Animal{name='hfg', age=33}, Animal{name='hfg', age=34}]

        fu f = new zi();
        System.out.println(f.getAge());
        f.method();
        f.mm();
        System.out.println("----------------------------------------------------------");

    }
}
