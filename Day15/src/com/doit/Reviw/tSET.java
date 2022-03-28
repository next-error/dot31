package com.doit.Reviw;

import java.util.Iterator;

public class tSET {
    public static void main(String[] args) {
        MyArraylist<String> arraylist = new MyArraylist();
        arraylist.add("AAA");
        arraylist.add("BBB");
        arraylist.add("CCC");
/*        arraylist.add("AAA");
        arraylist.add("BBB");
        arraylist.add("CCC");
        arraylist.add("AAA");
        arraylist.add("BBB");
        arraylist.add("CCC");
        arraylist.add("CCC");
        arraylist.add("CCC");*/
        System.out.println(arraylist);
        arraylist.remove(1);
        System.out.println(arraylist);
        arraylist.add(1,"hei");
        System.out.println(arraylist);
        System.out.println(arraylist.set(2, "和"));
        System.out.println(arraylist);
        System.out.println("----------------------------");
/*        Iterator<String> it = arraylist.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }*/
        for (String s : arraylist){
            System.out.println(s);
        }

    }
}
