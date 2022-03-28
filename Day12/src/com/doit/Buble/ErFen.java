package com.doit.Buble;

public class ErFen {
    public static void main(String[] args) {
        int [] list ={1,5,8,12,33,45,57,78,88,99,102,105,111};
        int i = chose(list,45);
        System.out.println(i);
    }
    public static int chose (int [] list,int keyvalue){
        int min =0;
        int max = list.length-1;
        while (min<=max){
            int mid = (min+max)/2;
            if(keyvalue<list[mid]){
                max =mid-1;
            }else  if(keyvalue>list[mid]){
                min=mid+1;
            }else {
                return mid;
            }

        }
        return -1;
    }
}
