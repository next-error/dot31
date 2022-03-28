package com.doit.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Company {
    private double total_Assets;
    private ArrayList<Employee> em_List;

    //幸运员工七天假
    public void one_Week_Off(){
        if (em_List.size() <=0) {
            System.out.println("公司还没人儿呢");
            return;
        }
        Random ra = new Random();
        int r =ra.nextInt(em_List.size());
        System.out.println("幸运员工是:"+em_List.get(r).getName());
    }

    //调薪传参版
    public void adj_Salary(double adj, String id) {
      a:  while (true) {
            for (int i = 0; i < em_List.size(); i++) {

                if (id.equals(em_List.get(i).getId())) {
                    em_List.get(i).setSalary(em_List.get(i).getSalary()+adj);
                    //System.out.println(i);
                    break a;
                }
            }
            System.out.println("员工不存在");
            break a;
        }
    }

    //调薪键盘输入版
    public void adjust_Salary (double adj){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要调薪的员工id");
        //System.out.println("请输入需要调薪的员工姓名");
        String str = sc.next();
       a: while (true) {
            for (int i = 0; i < em_List.size(); i++) {
                if (str.equals(em_List.get(i).getId())) {
                //if (str.equals(em_List.get(i).getName())) {
                    em_List.get(i).setSalary(em_List.get(i).getSalary() + adj);
                    break a;
                }
            }
            System.out.println("该员工不存在");
            break a;
        }
    }
//展示公司信息
    public void show_Company (){
        System.out.println("+++++++++++++公司总资产:"+total_Assets+"++++++++++++++++");
        if (em_List.size()<=0) {
            System.out.println("公司还没有员工,请先招聘");
            return;
        }
        for (int i = 0; i < em_List.size(); i++) {

            System.out.println("__________________________________");
            System.out.println("员工id:"+em_List.get(i).getId());
            System.out.println("员工姓名:"+em_List.get(i).getName());
            System.out.println("员工存款:"+em_List.get(i).getDeposit());
            System.out.println("员工薪资"+em_List.get(i).getSalary());
            if (em_List.get(i) instanceof Manger) {
                // em_List.get(i)是Employee类型,无法获取到奖金,需要向下转型
                Manger manger = (Manger) em_List.get(i);
                System.out.println(manger.getBonus());
            }
        }
    }

    //定义发工资方法
    public void payroll(){
        //首先获取到员工的薪资和奖金信息
        for (int i = 0; i < em_List.size(); i++) {
            if (em_List.size()==0) {
                System.out.println("公司还没有员工,请先招聘");
                return;
            }
            total_Assets -=em_List.get(i).getSalary();
            if (em_List.get(i) instanceof Manger) {
                // em_List.get(i)是Employee类型,无法获取到奖金,需要向下转型
                Manger manger = (Manger) em_List.get(i);
                total_Assets = total_Assets - manger.getBonus();
            }
        }
    }

    public Company() {
    }

    public Company(double total_Assets, ArrayList<Employee> em_List) {
        this.total_Assets = total_Assets;
        this.em_List = em_List;
    }

    public double getTotal_Assets() {
        return total_Assets;
    }

    public void setTotal_Assets(double total_Assets) {
        this.total_Assets = total_Assets;
    }

    public ArrayList<Employee> getEm_List() {
        return em_List;
    }

    public void setEm_List(ArrayList<Employee> em_List) {
        this.em_List = em_List;
    }
}
