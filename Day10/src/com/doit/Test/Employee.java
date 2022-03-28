package com.doit.Test;

public abstract class Employee {
    private String id;
    private String name;
    private double deposit;
    private double salary;
    public abstract void view_Deposit ();

    public Employee() {
    }

    public Employee(String id, String name, double deposit, double salary) {
        this.id = id;
        this.name = name;
        this.deposit = deposit;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
