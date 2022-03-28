package com.TSET.test3;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        boolean b = check_duicheng(s);
        System.out.println(b);
    }
    public static boolean check_duicheng(String s){
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = s.charAt(s.length()-1-i);
            if (!(a==b)) {
                return false;
            }
        }
        return true;
    }
}
