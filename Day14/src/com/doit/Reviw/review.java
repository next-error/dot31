package com.doit.Reviw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class review {
    /*
    collection集合
    迭代器
    泛型
    list集合
    数据结构基础
     */
    public static void main(String[] args) {
        //collection集合,所有集合的根集合
            /*
            要掌握集合根类的方法:
            add
            remove:返回一个布尔值
            clear
            size
            toArray
             */
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println(list);// [aaa, bbb, ccc, ddd]
        // String类型的集合可以直接打印,它重写了toString方法
        list.remove("bbb");
        System.out.println(list.remove("a"));//false
        System.out.println(list.remove('a'));//false
        System.out.println(list);//[aaa, ccc, ddd]

        int s = list.size();
        System.out.println(s);//3

        String [] arr = list.toArray(new String[0]);//写的数字如果比list集合size小,默认会用list.size. 若超过list.size,后面为null
        String[] arr1 = Arrays.copyOf(arr, 10);//这个写小了就截取到当前为止
        System.out.println(arr.length);//3
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);// aaa  ccc  ddd
        }
       // list.clear();//清空集合内元素




        //迭代器 collection及其子类专用 collection中有Iterator方法.调用直接返回Iterator接口的实现类
        Iterator iterator = list.iterator();
            //使用过程不可以进行删或插入数据操作,不然会报错 在倒数第二个元素位置执行删除,碰巧不会报错
        while (iterator.hasNext()){
            String s1 = (String) iterator.next();//z这里一定要先接收,再打印
        }
            //增强for 底层用的就是迭代器  实现itterable接口的都可以用增强for
        for(String s1: list){
            System.out.println(s1);
        }



        //泛型
        /*
        自定义泛型:详见fanxing包下
            另:抽象类或接口里的泛型,可以在继承或实现时指定类型;  若继承或实现时依然使用泛型,则在子类创建对象时需要传入具体类型
        泛型的使用;需要传自定义类型,但又不希望是object
            ? :代表obje类型
            ? extends 类  上限限定 只能传入当前类型 及其子类类型
            ? super 类  显现限定 只能传当前类型及其父类类型
         */






        //list集合
        /*
        list集合特点: 有序,有索引,可重复
        方法 add  get  set  remove
            - public void add(int index, E element): 将指定的元素，添加到该集合中的指定位置上。
            - public E get(int index):返回集合中指定位置的元素。
            - public E remove(int index): 移除列表中指定位置的元素, 返回的是被移除的元素。
            - public E set(int index, E element):用指定元素替换集合中指定位置的元素,返回值的更新前的元素。

         实现类; ArrayList  LinkedList 即:这连个集合都是有序的,都有索引,元素都可以重复
                ArrayList: 底层是数组 查询块,增删慢
                LinkedList:底层是链表 查询慢,增删块
         */



        //
    }
}
