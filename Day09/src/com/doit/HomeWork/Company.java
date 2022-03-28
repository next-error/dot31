package com.doit.HomeWork;

public class Company {
    public  void check_Salary (Employee employee){
        System.out.println("员工工号:"+employee.getId());
        System.out.println("员工姓名:"+employee.getName());
        if (employee instanceof Programmer) {
            System.out.println("员工职位:程序员");
            employee.cal_Salary();
        }
        if (employee instanceof Manger) {
            System.out.println("员工职位:经理");
            employee.cal_Salary();
        }
    }
}
