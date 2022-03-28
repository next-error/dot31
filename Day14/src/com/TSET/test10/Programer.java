package com.TSET.test10;

import com.TSET.test11.Employee;

public class Programer extends Employee

{
    private double   jiangJin;

    public Programer() {
    }

    public Programer(String id, String name, double salary, double jiangJin) {
        super(id, name, salary);
        this.jiangJin = jiangJin;
    }


    @Override
    public void work() {

    }

    @Override
    public void cal_Salary() {
        System.out.println(getSalary()+jiangJin);
    }

}
