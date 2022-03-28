package com.doit.Test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> em_List= new ArrayList<Employee>();
        Company company = new Company(1000000,em_List );
        //System.out.println(company.getTotal_Assets());
        Employee employee1 =new Manger("301","王兴",50000,20000,30000);
        Employee employee2 =new Cook("401","黄大厨",20000,10000);
        Employee employee3 =new Waiter("501","杨晓",10000,13000);
        em_List.add(employee1);
        em_List.add(employee2);
        em_List.add(employee3);
        //company.show_Company();
        //company.payroll();
        //company.adjust_Salary(4000);
        //company.adj_Salary(4000,"401");
        //company.show_Company();
        company.one_Week_Off();

    }
}
