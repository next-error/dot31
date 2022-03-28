package com.doit.Person;

public class Student extends Person{
     String id;
    private String name = "李宗盛";


    public Student(){
        super();

        //虽然没写,java默认有super();会先执行父类的空参构造方法
        System.out.println("Student的空参构造执行了");
    }

    public Student(String name, int age, String id) {

        super(name, age);//这里调用的是父类Person的带参构造方法,将首行传来的name和阿哥通过赋给super里的name和age,间接给父类的带参构造赋值
        this.id = id;
        System.out.println("Student的带参构造执行了");

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
}
