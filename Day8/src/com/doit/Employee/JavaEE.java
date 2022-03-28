package com.doit.Employee;

public  class JavaEE extends YanFa{
    public JavaEE() {
    }

    public JavaEE(int id, String name) {
        super(id, name);
    }
    public void work (){
        System.out.println("员工号为"+getId()+"的"+getName()+"员工,正在研发淘宝网站");
    }
}
