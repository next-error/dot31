package com.doit.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("aa");
        l1.add("bb");
        l1.add("cc");
        l1.add("dd");
        //遍历
        Iterator<String> it =l1.listIterator();
        while (it.hasNext()){
            String s = it.next();
            it.remove();
            System.out.println(s);
        }
        //复习一下内部类使用
        FU f =new ZI();
        FU.zz Z = new FU().new zz();


    }
}
