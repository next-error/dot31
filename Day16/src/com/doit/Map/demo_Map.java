package com.doit.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class demo_Map {
    /*
    put 添加和修改 返回值为操作前的元素,如首次添加,返回null,若该key已经存在,则为修改,返回修改前的元素
    remove
    get
    containsKey
     */
    public static void main(String[] args) {
        Map<String,Integer> my_map = new TreeMap<>();
        my_map.put("liyyan",45);
        my_map.put("dfse",4);
        my_map.put("gddf",435);
        System.out.println(my_map);
        Integer i = my_map.get("liyyan");
        System.out.println(i);
        Integer i1 = my_map.remove("liuyan");//找不到key返回null
        Integer i2 = my_map.remove("liyyan");//找不到key返回null
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(my_map);
        boolean b1 = my_map.containsKey("liuyan");//查找key
        System.out.println(b1);

        // my_map.computeIfAbsent("liyyan",14);
        // my_map.forEach();

        //map集合遍历

        Set<String> keySet = my_map.keySet();

        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key =iterator.next();
            Integer value =my_map.get(key);
            System.out.println(key+"="+value);
        }
        for (String key : keySet) {
            System.out.println(key + "" + my_map.get(key));
            System.out.println("++++++++++++++++");
        }
            //第二种遍历
            //Entry 存储映射关系的接口,在map内部,也有泛型,
            Set<Map.Entry<String, Integer>> entries = my_map.entrySet();//此方法返回一个映射关系的set集合,类型为Map.Entry<String, Integer>
            Iterator<Map.Entry<String, Integer>> it1 = entries.iterator();
            while (it1.hasNext()){
                Map.Entry<String, Integer> en = it1.next();
                String key1 = en.getKey();
                Integer value1 = en.getValue();
                System.out.println(key1+"+"+value1);

            }
            //增强for
            for (Map.Entry<String, Integer> entry:entries){
                System.out.println(entry.getKey() + "" + entry.getValue());
            }

    }
}
