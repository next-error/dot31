package com.doit.Person;
/*
定义一个类:
    构造方法
    private 属性(属性属于对象,并不属于类) 内存解析时,属性会加载到堆内存,但方法只会加载一个地址放入堆内存中  成员变量在整个类中都生效
    set 和 get
    方法(类的行为)
 */
public class Person {
    public Person (int age, String name, char sex,boolean loveJava){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.loveJava = loveJava;
    }
    // private final int age  =30; final 后值不能再做更改
    private int age;
    private String name ;
    private char sex;
    private boolean loveJava;

/*    public void eat (){
        int age = 34;
        String name = "宝钗";
        System.out.println(name+"吃完了"+this.name+"没吃呢");

    }
    public void sleep (){
        System.out.println("睡着了");
    }*/
    public void setAge(int age){
        this.age =  age;

    }
    public int getAge (){
        return age;

    }
    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setSex(char sex){
        this.sex = sex;
    }
    public char getSex (){
        return sex;
    }
    public void setLoveJava(boolean loveJava){
        this.loveJava = loveJava;
    }
    public boolean isLoveJava (){
        return loveJava;

    }

}
