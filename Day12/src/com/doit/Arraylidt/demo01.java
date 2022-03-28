package com.doit.Arraylidt;

import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args) {
        //向arrayl中插入一个元素,其底层就是数据;
/*        ArrayList<Integer> arr1 =new ArrayList<int>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(3);
        arr1.add(5);*/
        String [] list ={"A","C","D",null};
        String a ="B";
        int index =1;
        int size =3;
        System.arraycopy(list,index,list,index+1,size-index);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        list[index]=a;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
    }
}
