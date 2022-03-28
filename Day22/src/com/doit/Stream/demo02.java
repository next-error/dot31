package com.doit.Stream;

import java.util.stream.Stream;

public class demo02 {
    /*
    函数拼接方法(非终结方法):
        limit(int n):获取Stre流前n个元素
        skip(int n):跳过前n个
        distinct():去重
        filter(Predicate<>)过滤
        map(Function mapper):将一个类型的流转换为另一种类型的流
        static contact(Stream )将两个流合并为一个
    终结方法:返回值类型不是Stream,一个Stream流只能调用一次
        count
        forEach:逐一处理,不保证执行顺序
     */
    public static void main(String[] args) {
        Stream<String> stream =  Stream.of("大娃","二娃","三娃","四娃","五娃","六娃","七娃","爷爷","蛇精","蝎子精");

    }
}
