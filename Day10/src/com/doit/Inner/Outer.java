package com.doit.Inner;
/*'
内部类可以直接访问外部类的私有成员变量
 */
public class Outer {
    private int a = 10;
    private  void method1(){
        System.out.println("外部类的成员方法");
    }
    public class Inner  {
        private  int a = 20;
        public void method (){
            int a = 30;
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Outer.this.a);//访问外部变量
        }
    }
}
