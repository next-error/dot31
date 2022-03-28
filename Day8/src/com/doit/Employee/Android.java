package com.doit.Employee;

public  class Android extends YanFa {
    public Android() {
    }

    public Android(int id, String name) {
        super(id, name);
    }
    public void work (){
        System.out.println("员工号为"+getId()+"的"+getName()+"员工,正在研发淘宝手机客户端软件");
    }
}
