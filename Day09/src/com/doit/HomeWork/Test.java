package com.doit.HomeWork;

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        //company.check_Salary(new Programmer(201,"王顺",4000.0,5000));
        System.out.println("____________________________________________________");
        //company.check_Salary(new Manger(301,"张三",4000,3000));
        Employee employee1 = new Manger(301,"张三",4000,3000);
        company.check_Salary(employee1);
        System.out.println("____________________________________________________");
        Employee employee2 = new Programmer(201,"王顺",4000.0,5000);
        company.check_Salary(employee2);
    }
}
