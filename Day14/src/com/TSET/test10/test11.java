package com.TSET.test10;

import com.TSET.test11.Employee;

public class test11 {
    public static void main(String[] args) {
Company company =new Company("大黄集团");
        Employee employee1 = new Manger("112","李华",15000,50000);
        Employee employee2 = new Manger("113","灵明",17000,40000);
        company.show(employee1);
        System.out.println("___________________________________");
        company.show(employee2);
    }
}
