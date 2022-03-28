package com.doit.HomeWork;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
    判断一个键盘录入的字符串是否是一个QQ号
          QQ号的规则
              1.长度 5-11
              2.0不能开头
              3.纯数字
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入qq号");
        String qq =sc.next();
        System.out.println(checkqq(qq));
    }
    public static boolean checkqq  (String qq){
        if (qq.length()<5 || qq.length()>11) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c =qq.charAt(i);
             if (c<'0'||c>'9') {
                return false;
            }
        }
        return true;
    }
}
