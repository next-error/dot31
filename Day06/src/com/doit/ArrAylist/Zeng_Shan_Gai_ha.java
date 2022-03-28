package com.doit.ArrAylist;

import java.util.ArrayList;

public class Zeng_Shan_Gai_ha {
    public static void main(String[] args) {
        ArrayList<String> daGuanYuan = new ArrayList<>();
        daGuanYuan.add("元春");
        daGuanYuan.add("迎春");
        daGuanYuan.add("探春");
        daGuanYuan.add("惜春");
        show(daGuanYuan);
        System.out.println("_______________________");
        //删除 remove 1.删除在指定元素,返回布尔值  2.按指定索引删除
/*        boolean a =daGuanYuan.remove("惜春");
        System.out.println(a);
        show(daGuanYuan);*/
/*        String s =daGuanYuan.remove(3);
        System.out.println("被赶走的是"+s);
        show(daGuanYuan);*/
        //修改
/*        String c = daGuanYuan.set(3,"宝钗");
        System.out.println("修改的是"+c);
        show(daGuanYuan);*/
        //清空
/*        daGuanYuan.clear();
        System.out.println(daGuanYuan.size());
        show(daGuanYuan);*/

    }
    public static void  show (ArrayList<String> YuanZi) {
        for (int i = 0; i < YuanZi.size(); i++) {
            System.out.println(YuanZi.get(i));
        }
    }
}
