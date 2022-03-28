package com.doit.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws TheSameNameExceptiom{
        ArrayList<String> user_List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要注册的用户名:");
            String user_Nmae = sc.next();
            for (int i = 0; i < user_List.size(); i++) {
                if (user_List.get(i).equals(user_Nmae)) {
                    throw new TheSameNameExceptiom("用户名重复");
                }
            }
            user_List.add(user_Nmae);
        }


    }
}
