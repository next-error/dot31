package com.doit.HomeWork;

public class Employee {
    private String id;
    private String name;
    private double cunKkuan;
    private double Salary;

    public Employee(String id, String name, double cunKkuan, double salary) {
        this.id = id;
        this.name = name;
        this.cunKkuan = cunKkuan;
        Salary = salary;
    }

    public Employee() {
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

    public double getCunKkuan() {
        return cunKkuan;
    }

    public void setCunKkuan(double cunKkuan) {
        this.cunKkuan = cunKkuan;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
