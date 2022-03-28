package com.doit.Arraylidt;

public class demo02 {
    public static void main(String[] args) {
        //数组删除一个元素并返回
        String [] list  = {"A","B","C"};
        int index =1;
        int size = 3;
        String rem =list[index];
        int moveNum = size-index-1;
        System.arraycopy(list,index+1,list,index,moveNum);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        list[--size]=null;
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }
        System.out.println(rem);
    }
}
