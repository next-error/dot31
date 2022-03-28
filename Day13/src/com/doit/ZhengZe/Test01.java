package com.doit.ZhengZe;

public class Test01 {
    public static void main(String[] args) {
        String s = "b";
        //[]
        //[^]除了括号的字符
        //.任意字符
        //?至多一次
        //*任意c次
        //+至少一次
        //{}
        String regx="[a-zA-z_0-9]?[a-z]";
        boolean b = s.matches(regx);
        System.out.println(b);
        //邮箱
        String regex ="[a-zA-Z_0-9]+@([a-z]+\\.[a-z]+)+";
        String mail ="2rwr27335@qq.com";
        System.out.println(mail.matches(regex));

    }
}
