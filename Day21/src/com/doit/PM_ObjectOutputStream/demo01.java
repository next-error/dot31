package com.doit.PM_ObjectOutputStream;

import java.io.*;

public class demo01 {
    /*
序列化:将代码执行的对象内容写入硬盘  静态不属于对象,不能序列化.   瞬态也不能序列化,瞬态就是阻止序列化
        当类里属性的权限修饰符更改后,反序列化会抛出序列号不一致异常,可以自定义序列号解决
反序列化:将硬盘内容读取
     */
    public static void main(String[] args) throws IOException {

        //witerObj();
        try {
            readObj();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //序列化
    public static void witerObj() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Day21\\obj\\Person.txt"));
        Person p = new Person("张三",22);
        oos.writeObject(p);
        oos.close();
    }
    //反序列化
    public  static  void readObj() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Day21\\obj\\Person.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
