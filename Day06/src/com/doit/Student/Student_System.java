package com.doit.Student;

import java.util.Random;
import java.util.Scanner;

public class Student_System {
    public static void main(String[] args) {

        //遍历学生姓名及id


        //定义一个Student类型的数组
        Student[] arrStu = new Student[3];
        stu_LuRu(arrStu);

        //遍历,输出数组中存的Studen类型对应的属性
        stu_BianLi(arrStu);

        //点名
        System.out.println(stu_DianMing(arrStu).id+" "+ stu_DianMing(arrStu).name);


    }
    //手动输入学生姓名及id
    public static void stu_LuRu(Student [] arr){
        //Student类型的arr[i] 需要用Student类型的变量存储
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Student s = new Student();
            System.out.println("请输入第"+(i+1)+"个学生的id");  //为啥一定要用s.id,用arr[i].id 就报错?????
            s.id = sc.next();
            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            s.name = sc.next();
            arr[i] = s;
        }
    }
    //遍历学生姓名及id
    public  static void stu_BianLi (Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            Student s = new Student();
            s= arr[i];
            System.out.println(s.name+" "+s.id);
        }
    }

    //点名系统
    public static Student stu_DianMing (Student [] arr) {
        Random ra = new Random();
        int r = ra.nextInt(arr.length);
        Student s = new Student();
        s = arr[r];
        return s;
    }
}
