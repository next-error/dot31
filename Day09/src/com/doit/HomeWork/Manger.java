package com.doit.HomeWork;

public class Manger extends Employee{
    private  double manger_Salary;

    @Override
    public void cal_Salary() {
        System.out.println("员工工资:"+(getSalary()+manger_Salary));
    }

    public Manger() {
    }

    public Manger(double manger_Salary) {
        this.manger_Salary = manger_Salary;
    }

    public Manger(int id, String name, double salary, double manger_Salary) {
        super(id, name, salary);
        this.manger_Salary = manger_Salary;
    }

/*    public double getManger_Salary() {
        return manger_Salary;
    }*/

    public void setManger_Salary(double manger_Salary) {
        this.manger_Salary = manger_Salary;
    }
}
