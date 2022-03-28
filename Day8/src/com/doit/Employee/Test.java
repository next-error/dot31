package com.doit.Employee;

public class Test {
    public static void main(String[] args) {
        Employee java = new JavaEE(1,"玉");
        Employee Android = new Android(2,"大");
        Employee wangluo = new WangWei(3,"大");
        java.work();
        Android.work();
        wangluo.work();
    }
}
