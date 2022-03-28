package com.doit.FanHuiZhi;
/*
引用类型作为方法参数或返回值,本类.子类.多态子类.匿名内部类
 */
public class Test {
    public static void main(String[] args) {
        Person p =new Person();
        method(p);
        method(new Person());
        method(new Student());
       Person P2 = new Person(){};
       method(P2);

       //接口
        method3(new Brid());
        method3(new Fly(){});
        Brid g = new Brid();
        Fly f = method4();

    }
    public static void   method  (Person person){
        System.out.println("");
    }
    public static Person method2 (){
        //return new Person();
        Person P2 = new Person(){};
        //return  new Student();
        return P2;
    }

    public static  void method3 (Fly fly){

    }
    public static  Fly method4 (){
      //  return new Brid();
        return new Fly() {};
    }
}
