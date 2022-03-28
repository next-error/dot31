package com.TSET.test10;

import com.TSET.test11.Employee;

public class Company {
    private String name;

    public void show(Employee employee){
        System.out.println("公司名称"+name);
        System.out.println("员工id:"+employee.getId());
        System.out.println("员工姓名"+employee.getName());
        if (employee instanceof Manger ){
            System.out.println("员工职位:经理");
        }
        else if (employee instanceof Programer){
            System.out.println("员工职位:程序员");
        }else {
            System.out.println("职位不存在");
        }
        System.out.println("员工工资:"+employee.getSalary());

    }

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
