package com.doit.Stu_System_Logini;

import java.util.ArrayList;
import java.util.Scanner;

public class Text01 {
    public static void main(String[] args) {
        ArrayList<Student_Class> stu = new ArrayList<>();
        /*
        登录和注册功能
        先搭建框架,用switch让用户选择,再具体完成注册和登录功能
         */
        ArrayList<User> user_List = new ArrayList<>();
      a:  while (true) {
            System.out.println("欢迎使用学生管理系统");
          System.out.println("1.注册  2.登录  3.退出系统");
            int chose_Num = enter_Num();
            switch (chose_Num) {

                case 1:
                    //定义一个User类型的集合,将user的信息存进集合

                    register(user_List);
                    break;
                case 2:
                    //登录
                    if(user_List.size()==0){
                        System.out.println("系统中还没有用户,请先注册");
                        break;
                    }
                    login(user_List);

                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("---------------欢迎来到学生管理系统---------------");
                    b:
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

                                    break b;
                                }
                            default:
                                System.out.println("您的输入有误,请重新输入");
                                break;
                        }
                    }

                    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    break ;

                case 3:
                    System.out.println("退出系统");
                    break a;
                default:
                    System.out.println("您的输入有误,请从新输入");
                    break;
            }
        }
    }

//登录方法
    public static void login(ArrayList<User> user_list ){
      a:  while (true) {
            System.out.println("请输入您的用户名");
            String username = enter_String();
            if (check_Username(user_list, username)) {
                //检查用户名是否存在,若不存在,则需要重新输入用户名,若存在,则继续输入密码
                System.out.println("请输入您的密码");
                String password = enter_String();
                for (int i = 0; i < user_list.size(); i++) {
                    User user = user_list.get(i);
                    String u = user.getUsername();
                    String s = user.getPassword();
                    if(u.equals(username) && s.equals(password)){
                        //检查输入的账号和密码是否存在,存在则显示登录成功,跳出while循环
                        System.out.println("登录成功");
                        break a;
                    }
                }//
                System.out.println("您输入的账户名或密码错误");
                break;
            } else {
                System.out.println("您输入的用户名不存在,是否需要重新请从新输入Y/N");
                String s = enter_String();
                if (!s.equalsIgnoreCase("y")) {
                    break a;
                }


            }
        }


    }


    //定义注册用户
    public static void register (ArrayList<User> user_list){
        User user = new User();
        while (true) {
            System.out.println("请输入您的用户名");
            //需要判断用户名是否相同,返回一个布尔值,若为true,则需要重新输入
            String str = enter_String();
            boolean check_Username_Flag = check_Username(user_list, str);
            if (check_Username_Flag) {
                System.out.println("用户名已存在,请重新输入");
            } else {

                user.setUsername(str);
                break;
            }
        }
        System.out.println("请输入您的密码");
        user.setPassword(enter_String());
        user_list.add(user) ;
        System.out.println("注册成功");

    }

    //定义方法检测用户名
    public static boolean check_Username (ArrayList<User> user_list , String str ){

        for (int i = 0; i < user_list.size(); i++) {
           User user = user_list.get(i);
            if (str.equals(user.getUsername())) {
                return true;
            }
        }
        return false;
    }



    //定义键入字符的方法
    public static String enter_String() {
        Scanner sc = new Scanner(System.in);
        String enter_Str = sc.next();
        return enter_Str;
    }

    //定义键入数字的方法
    public static int enter_Num() {
        Scanner sc = new Scanner(System.in);
        int clik_Num = sc.nextInt();
        return clik_Num;
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


}
