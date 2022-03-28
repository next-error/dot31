package com.doit.Test;

public class Manger extends Employee{
    private double bonus;

    @Override
    public void view_Deposit() {
        System.out.println(getName()+"经理存款为:"+getDeposit());
    }

    public Manger() {
    }


    public Manger(String id, String name, double deposit, double salary, double bonus) {
        super(id, name, deposit, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
