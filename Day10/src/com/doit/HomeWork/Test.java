package com.doit.HomeWork;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Company company=  new Company();
        company.setZongZiChan(10000000);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Manger("101","答案",20000.0,30000,50000));
        list.add(new ChuShi("101","二哈",20000.0,30000));
        list.add(new FuWuYuan("101","da哈",20000.0,30000));
        company.setList(list);
company.show(company);


    }
}
