package com.doit.HomeWork;

import java.util.ArrayList;

public class Company {
    private double zongZiChan;
    private ArrayList<Employee> List;

    //展示公司
    public void show(Company company){
        System.out.println("公司总资产为"+company.zongZiChan);
        for (int i = 0; i < company.getList().size(); i++) {
            if (company.getList().size()==0) {
                System.out.println("没有员工");
                return;
            }
            Employee employee =company.getList().get(i);
            System.out.println("员工id:"+employee.getId());
            System.out.println("员工姓名:"+employee.getName());
            System.out.println("员工薪资:"+employee.getSalary());
            System.out.println("员工存款:"+employee.getCunKkuan());
            if (employee instanceof Manger) {
                Manger manger =(Manger) employee;
                System.out.println("经理奖金"+manger.getBonus());
            }

        }
    }













    public Company() {
    }

    public Company(double zongZiChan, ArrayList<Employee> list) {
        this.zongZiChan = zongZiChan;
        List = list;
    }

    public double getZongZiChan() {
        return zongZiChan;
    }

    public void setZongZiChan(double zongZiChan) {
        this.zongZiChan = zongZiChan;
    }

    public ArrayList<Employee> getList() {
        return List;
    }

    public void setList(ArrayList<Employee> list) {
        List = list;
    }
}
