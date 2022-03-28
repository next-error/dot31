package com.doit.HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class tset {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        arrayList.add('a');
        arrayList.add('b');
        arrayList.add('c');
        arrayList.add('d');
        Character[] ch = arrayList.toArray(new Character[0]);
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        Character C = 'a';
        char c = C.charValue();
    }
}
