package com.doit.HomeWork;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        String s = "abcaaaccccabcbbbbabcllllabcabc";

        int b = 0;
        //int i=1;
//while ((i=s.indexOf("abc",i+3))!=-1)
        for (int j = 0; j < s.length() ;j++) {
            System.out.println(s.indexOf("abc", j + 3));
            if (s.indexOf("abc",j+3)!=-1) {
                b++;
            }


        }
    //b++;
        System.out.println(b);

    }
}