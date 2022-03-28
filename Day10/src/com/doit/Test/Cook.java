package com.doit.Test;

public class Cook extends Employee{
    @Override
    public void view_Deposit() {
        System.out.println(getName()+"厨师存款为:"+getDeposit());
    }

    public Cook() {
    }

    public Cook(String id, String name, double deposit, double salary) {
        super(id, name, deposit, salary);
    }

}
