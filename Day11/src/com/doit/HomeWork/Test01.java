package com.doit.HomeWork;

import java.util.ArrayList;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

/*    说明：在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
    如“性”、“色情”、“爆炸”、“恐怖”、“枪”、“军火”等，
    这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉*/

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("性");
        list.add("色情");
        list.add("爆炸");
        list.add("恐怖");
        list.add("枪");
        list.add("军火");
        //System.out.println(list);
        while (true) {
            System.out.println("请输入聊天内容:");
            String s = sc.nextLine();
            String s1=s ;
            for (int j = 0; j < list.size(); j++) {
               s=s.replace(list.get(j), "*");
            }
                  System.out.println(s);
              }
    }





    }


/*
public class Test01 {
    public static void main(String[] args) {
        String[] arr = {"性","色情","爆炸","恐怖","枪","军火"};

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for (int i = 0; i < arr.length; i++) {

            //如果包含对应的敏感字就 替换  //其实不判断也可以 不包含就不替换
            //if(line.contains(arr[i])){
                //替换完成后 为原来的字符串 重新赋值
                line =  line.replaceAll(arr[i],"*");
            //}
        }

        System.out.println(line);

    }
}*/
