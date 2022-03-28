package com.doit.aa;


import org.junit.Test;

public class demo_test {
    @Test
    public void method(){
        System.out.println("单元测试 1");

    }
    @Test
    public void method2(){
        System.out.println("单元测试2");
        System.out.println(sum(10,20));
    }
    public int sum(int a,int b){
       return a+b;
    }
}
