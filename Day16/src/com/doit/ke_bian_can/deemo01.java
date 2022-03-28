package com.doit.ke_bian_can;
/*
可变参数: 参数类型...参数名 这个相当于数组
    每个方法最多只能有一个可变参数,且必须放在最后
    Object...obj 任意类型,任意个
 */
public class deemo01 {
    public static void main(String[] args) {
        System.out.println(sum(12, 33, 55, 666, 777, 333, 444));
    }
    public static int sum (int a,int...b){
        int sum=0;
        for (int i = 0; i < b.length; i++) {
             sum=a;
            sum +=b[i];

        }
        return sum;


    }
}
