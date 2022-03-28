package com.doit.demo;

public class Day04总结 {
    public static void main(String[] args) {
        /*
        数组
            储存数据的容器,可以固定长度;  容器可以储存任何类型的数据,但一个容器只能储存一种类型的数据
            定义: 数据类型 [] 变量名 = new 数据类型(长度);
                 数据类型 [] 变量名 = new 数据类型(){数据1,数据2,...};
             **  数据类型 [] 变量名 =  {数据1,数据2,..};// 简易定义,不可以只定义不赋值,但前两种定义方式可以
                []:代表数组
                new:代表向jvm的堆内存中开辟空间
                变量名储存的是一个16进制的地址,储存在jvm栈内存中,通过调佣变量名获得地址,在堆内容中获取容器内的数据
                一个变量名只可以对应一个地址,一个地址可以对应多个变量名,当数组内容改变时,它对应的变量索引查找均可以发生变化
            索引:从0开始,length-1结束,共储存 变量名.length 个数据
        **  数组的增删改查:
                重新赋值可以改变数组的长度: 变量名 = new 数据类型[长度]  或 变量名 = new 数据类型 [] {数据1,数据2,...}
                修改: 变量名[索引值] = 新的变量值;
                查找:直接打印即可
              注:空数组内储存的值:
                    小数:0.0;   整数: 0;   字符: 空格 \u0000;    布尔:false;    引用类型: null
            java执行过程内存调用情况:
            遍历: for(i =0 ; i < 变量名.length; i++){
                    System.out.println(变量名.[i]):
                    }
            数组常见的异常:编译不会报错,但运行会报错
                    索引越界异常:当访问数组时 索引不存在 抛出此异常
                    NullPointerException: 引用型数组变量名 = null,访问此数组时会报错;
                            引用型数据默认为null,调用它的方法时会报错
        idea快捷键: Alt + 回车: 万能修复
                   Ctrl + Alt + L :格式化代码
         */
        //数组重新赋值会改变它的长度,但会改变它的存储地址,之前的地址作废
/*        int[] a = new int[2];
        System.out.println(a);
        a = new int[3];
        System.out.println(a);
        a = new int[]{1,2,3,4};
        System.out.println(a);
        System.out.println(a[3]);*/
        //
/*         int [] b = {1,2}; b = null;
        System.out.println(b[0]);*/
        int a= 1;
        System.out.println(a*=10);

    }
}
