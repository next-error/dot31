package com.TSET.test10;

import com.TSET.test11.Employee;

public class Manger extends Employee {
    private double manger_Salary;

    public Manger() {
    }

    public Manger(String id, String name, double salary, double manger_Salary) {
        super(id, name, salary);
        this.manger_Salary = manger_Salary;
    }

    @Override
    public void work() {

    }

    @Override
    public void cal_Salary() {
        System.out.println(getSalary()+manger_Salary);
    }
}
