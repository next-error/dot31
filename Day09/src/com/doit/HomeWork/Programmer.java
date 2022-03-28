package com.doit.HomeWork;

public class Programmer extends Employee {
    private double project_Bonus;

    @Override
    public void cal_Salary() {
        System.out.println("员工工资"+(getSalary() + project_Bonus));
    }

    public Programmer() {
    }
/*
    public Programmer(double project_Bonus) {
        this.project_Bonus = project_Bonus;
    }*/

    public Programmer(int id, String name, double salary, double project_Bonus) {
        super(id, name, salary);
        this.project_Bonus = project_Bonus;
    }

    public double getProject_Bonus() {
        return project_Bonus;
    }

    public void setProject_Bonus(double project_Bonus) {
        this.project_Bonus = project_Bonus;
    }
}
