package com.doit.Stream;

import java.util.*;
import java.util.stream.Stream;

public class demo {
    /*
    集合转Stream
    数组转Stream
     */
    public static void main(String[] args) {
        //集合:Collection的默认Stream方法调用,返回Stream类型
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Set<Integer> set = new HashSet<>();
        Stream<Integer> stream1 = set.stream();

        Map<String,Integer> map = new HashMap<>();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Stream<Map.Entry<String, Integer>> stream2 = entries.stream();
        Set<String> strings = map.keySet();
        Stream<String> stream3 = strings.stream();

        //数组 :Stream的静态方法调用
        String[] arr ={"hello","Word"};
        Stream<String> arr1 = Stream.of(arr);

    }
}
