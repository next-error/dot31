package com.doit.HomeWork;

public class Manger extends Employee{
    private  double bonus;

    public Manger() {
    }

    public Manger(String id, String name, double cunKkuan, double salary, double bonus) {
        super(id, name, cunKkuan, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
