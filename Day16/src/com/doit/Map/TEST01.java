package com.doit.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TEST01 {
    public static void main(String[] args) {
        Map<Character,Integer> map1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map1.containsKey(c)) {
                int count = map1.get(c);
                map1.put(c,count+1);
            }
            else {
                map1.put(c,1);
            }
        }
        System.out.println(map1);
    }
}
