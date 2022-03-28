package com.doit.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(132);
        list.add(124);

Collections.sort(list,(Integer in1 ,Integer in2)->{
    return in2-in1;
});
    //省略格式
        Collections.sort(list,(in1,in2)->in2-in1);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
