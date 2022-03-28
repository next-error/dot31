package com.doit.Test;

public class Waiter extends Employee{
    @Override
    public void view_Deposit() {

    }

    public Waiter() {
    }

    public Waiter(String id, String name, double deposit, double salary) {
        super(id, name, deposit, salary);
    }
}
