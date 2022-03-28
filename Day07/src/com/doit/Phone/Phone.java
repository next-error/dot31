package com.doit.Phone;

public class Phone {
    String paizi;
    int price;
    String color;
    public void call (){
        System.out.println(paizi+"牌"+price+"价格"+color+"颜色的手机打电话了");
    }
    public void sent_Txt(){
        System.out.println(paizi+"牌"+price+"价格"+color+"颜色的手机发短信了");
    }
    public void set_Phone (String paizi, int price, String color){
        this.paizi = paizi;
        this.price=  price;
        this.color = color;

    }
}
