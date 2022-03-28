package com.doit.String;

public class demo01 {
    public static void main(String[] args) {
        String s ="abc";
        String s1="abc";
        System.out.println(s==s1);//true
        String s2 ="";
        String s3 =null;
        System.out.println(s2==s3);//false
        String s4 =new String();
        System.out.println(s2==s4);//false
        System.out.println("|"+s2+"|");
        System.out.println("|"+s3+"|");
        System.out.println(s2.equals(s3));


    }
}
