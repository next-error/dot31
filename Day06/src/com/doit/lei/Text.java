package com.doit.lei;

public class Text {
    public static void main(String[] args) {
        //创建对象p1
        Person p1 = new Person();
        //为对象p1的属性赋值
        p1.name = "金莲";
        p1.age = 30;
        p1.gender = '女';
        p1.height = 150.4;
        p1.loveJava = true;
        //打印
        //System.out.println(p1.name+"  "+p1.age+"  "+p1.gender+"  "+p1.height+"  "+p1.loveJava);
        //创建对象p2
        Person p2 = new Person();
        //为p2对象属性赋值
        p2.name = "大朗";
        p2.age = 34;
        p2.gender = '男';
        p2.height = 110;
        p2.loveJava = false;
        //System.out.println(p2.name+"  "+p2.age+"  "+p2.gender+"  "+p2.height+"  "+p2.loveJava);
        Person p3 =new Person();

    Person [] arrPerson = new Person[3]; //arrPerson 存储 Person类型的地址值
        arrPerson[0] = p1; //将p1对象的地址值付给arrPerson[0]
        arrPerson[1] = p2; //将p2对象的地址值付给arrPerson[1]
        arrPerson[2] = p3; //将p2对象的地址值付给arrPerson[1]

        for (int i = 0; i < arrPerson.length; i++) {
            //System.out.println(arrPerson);//此时打印的为地址值
            System.out.println(arrPerson[i].name+"  "+arrPerson[i].age+" "+arrPerson[i].gender+" "+arrPerson[i].height);
            /*
            NullPointerException:引用类型数组名= null,报此错误
                    如这里不给arrPerson[2]赋值,引用类型数组会默认给arrPerson[2]赋值为null
             */
        }

    }
}
