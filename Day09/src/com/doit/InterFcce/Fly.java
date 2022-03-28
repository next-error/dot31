package com.doit.InterFcce;
/*
接口与类是实现关系,一个类可以实现多个接口
类在继承一个父类的同时,可以实现多个接口;接口内定义的方法必须在实现类冲重写,若多个接口间有重名的接口,重写一个即可,若接口许重写的方法在父类中已经定义,则
可以直接继承父类的重名方法,此时无需重写,若接口与需要重写的父类方法重名,只写一个即可

接口直接可以多继承

 */
public interface Fly {
    public abstract void open();
    public abstract void fly();

}
interface  a {
    public abstract void aa();

    public abstract void bb();
}
interface b extends a{

        public abstract void bb();
        public abstract void cc();
        public abstract void dd();

    }


abstract class FU{
    public abstract void dd();
    public void cc(){}
}



class Zi extends FU implements a,b{
    public void aa(){}
    public void bb(){}
    public void dd(){}


}