package com.doit.ThrowAble;

public class demo02 {
    public static void main(String[] args) {
        int a =10;
        try {
            a=20;
        }
        catch (Exception e){
            a=30;//try和catch有无异常时会执行一个
        }
        finally {
            a=40;//一定会执行
        }
        System.out.println(a);


        System.out.println(return_a());//20.return完了后a变成40


    }
    public static int return_a (){
        int a =10;
        try {
            a=20;
            return a;
        }
        catch (Exception e){
            a=30;//try和catch有无异常时会执行一个
            return a;
        }
        finally {
            a=40;//一定会执行
            System.out.println("a最后变成"+a);
        }

    }
}
