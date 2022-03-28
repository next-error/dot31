package com.doit.Compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test01 {




    public static void main(String[] args) {



Comparator <Student> comparator=new Comparator<Student>() {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.score, o1.score);
    }
};

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("001",99.9));
        list.add(new Student("002",99.1));
        list.add(new Student("003",80.1));
        list.add(new Student("004",77.7));
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,comparator);
        System.out.println(list);

/*        System.out.println(Double.compare(1111112.3, 1511.1));
        String s ="aaa";
        String s1 ="abb";
        s.compareTo(s1);*/
    }
}
