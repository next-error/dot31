package com.doit.Student_Jinjie1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        ArrayList<Student_Class> stu = new ArrayList<>();
/*        Student_Class s1 = new Student_Class();
        s1.id = "001";
        s1.name = "peter";
        s1.sex = "man";
        s1.age = "12";
        s1.address = "北京";
        stu.add(s1);*/

        //学生管理系统
        /*
        思路,先构建框架,写在main方法下,把各种功能写成各个方法去调用


         */
        //主页面及框架构建
        System.out.println("---------------欢迎来到学生管理系统---------------");
        a:
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询所有学生");
            System.out.println("5.退出系统");
            System.out.println("请输入对应的操作编号:");
            int clik_Num = enter_Num();
            switch (clik_Num) {
                case 1:
                    add_Student(stu);
                    break;
                case 2:
                    remove_Student(stu);
                    break;
                case 3:
                    System.out.println("修改学生");
                    break;
                case 4:
                    show_Student(stu);
                    break;
                case 5:
                    System.out.println("您确认要退出吗?确认请按Y,否则按其他键");
                    String insure_Exit = enter_String();

                    if (insure_Exit.equalsIgnoreCase("Y")) {

                        System.out.println("退出");

                        break a;
                    }
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }
    }


    //定义键入数字的方法
    public static int enter_Num() {
        Scanner sc = new Scanner(System.in);
        int clik_Num = sc.nextInt();
        return clik_Num;
    }

    //定义键入字符的方法
    public static String enter_String() {
        Scanner sc = new Scanner(System.in);
        String enter_Str = sc.next();
        return enter_Str;
    }

    public static void add_Student(ArrayList<Student_Class> stu) {
        Student_Class student_class = new Student_Class();
        //判断学号是否存在,若存在,则继续循环,若不存在,跳出死循环!
        while (true) {
            System.out.println("请输入学生的学号:");
            student_class.id = enter_String();
            boolean flag = judge_ID(stu, student_class.id);
            System.out.println("学号检查为" + flag);
            if (judge_ID(stu, student_class.id)) {
                System.out.println("学号已经存在,请重新输入");

            } else {
                break;
            }
        }

        System.out.println("请输入学生的姓名:");
        student_class.name = enter_String();
        System.out.println("请输入学生的年龄:");
        student_class.age = enter_String();
        System.out.println("请输入学生的性别:");
        student_class.sex = enter_String();
        System.out.println("请输入学生的地址:");
        student_class.address = enter_String();
        stu.add(student_class);
        System.out.println("学生信息添加成功");
        //若添加成功后选择继续添加,则操作的仍然是集合stu的0索引位置
        //这里衍生出两个问题:1.若做循环改变索引,信息添加成功之前,stu.size不会增加,不能使用stu.size遍历,则如何改变索引?
        //               2.相同索引下再次输入,会覆盖之前存贮的值,导致学号判断永远是系统拿着你刚刚键入的学号与刚被你覆盖的学号判断,这里会永远为true
            /*System.out.println("学生信息添加成功,是否继续添加Y/其他");
            String sc = enter_String();
            if (sc.equalsIgnoreCase("y")) {

            } else {
                break;
            }*/


    }

    public static void show_Student(ArrayList<Student_Class> stu) {
        Student_Class student_class = new Student_Class();
        if (stu.size() == 0) {
            System.out.println("系统还没有学生信息,请先添加");
        } else {
            System.out.println("学号   姓名   年龄   性别   地址");
            for (int i = 0; i < stu.size(); i++) {
                student_class = stu.get(i);
                System.out.println(student_class.id + "  " + student_class.name + "   " + student_class.age + "    " + student_class.sex + "   " + student_class.address);

            }
        }
    }

    //学号唯一标识判断
    public static boolean judge_ID(ArrayList<Student_Class> stu, String id) {
        boolean flag = false;
        for (int i = 0; i < stu.size(); i++) {
            //Student_Class student_class = new Student_Class();
            Student_Class student_class = stu.get(i);
            if (student_class.id.equals(id)) {
                flag = true;
                break;

            }
        }
        return flag;
    }

    //删除学生方法定义
    public static void remove_Student(ArrayList<Student_Class> stu) {
        System.out.println("请出入您要删除学生的学号:");
        String sc = enter_String();
        //Student_Class student_c
        //判断学号是否存在,存在则返回其索引值,不存在提醒用户重新输入
        //while (true){
        if (stu.size() == 0) {
            System.out.println("系统还没有学生,请先添加");
        } else {

            for (int i = 0; i < stu.size(); i++) {
                Student_Class student_class = stu.get(i);
                if (sc.equals(student_class.id)) {
                    System.out.println("i");
                    student_class = stu.remove(i);
                    System.out.println("学生信息删除成功");
                } else {
                    System.out.println("您输入的学号不存在");
                }
            }
        }
        //}
    }
    //
}
