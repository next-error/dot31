package com.doit.Reviw.fanxing;

public class teat {
    public static void main(String[] args) {
        Myclass< String> my = new Myclass();//此时my这个对象,xia_ji_er_xie类型传入String,该对象下不可改变
        Myclass<Integer> you = new Myclass<>();//此时you这个对象,xia_ji_er_xie类型传入Integer,该对象下不可改变
        my.method("aaa",10.0);//my调用该方法时.xia_ji_er_xie必须传入String, sui_bian_xie这里传入了Double
        you.method(111,true);//my调用该方法时.xia_ji_er_xie必须传入Integer, sui_bian_xie这里传入了Boolean

    }
}
