package com.doit.Employee;

public class WangWei extends WeiHu{
    public WangWei() {
    }

    public WangWei(int id, String name) {
        super(id, name);
    }
    public void work (){
        System.out.println("员工号为"+getId()+"的"+getName()+"员工,正在检查网络是否流畅");
    }
}
