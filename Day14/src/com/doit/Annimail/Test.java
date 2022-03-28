package com.doit.Annimail;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Annimal> list1 =new ArrayList<>();
        list1.add(new Annimal());
        list1.add(new Annimal());
        list1.add(new Annimal());
        ArrayList<dOG> list2 =new ArrayList<>();
        list2.add(new dOG());
        list2.add(new dOG());
        list2.add(new dOG());
        ArrayList<Cat> list3 =new ArrayList<>();
        list3.add(new Cat());
        list3.add(new Cat());
        list3.add(new Cat());
        //
        show(list1);
        show(list2);
        show(list3);

    }
    public static void show (ArrayList<?> list){
        for (Object an:list){
            Annimal A = (Annimal) an;
            A.eat();
            System.out.println(A);

        }
    }
}
