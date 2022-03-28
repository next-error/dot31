package com.doit.demo.LianXiTi;

public class Text03 {
    public static void main(String[] args) {
        /*
        定义一个方法，用于比较两个数组的内容是否相同
        判断一个数组是否相同,只有每一个相同索引下值相同,才会相等
         */
        int [] a = {1,3,4,6,8};
        int [] b = {1,3,4,6,0};
        System.out.println(chekArray(a, b));
    }
    //定义方法
    public static boolean chekArray (int [] a, int [] b){
        if (a.length != b.length){
            return false;
        }else {
            for (int i = 0; i < a.length; i++) {

                    if(a[i] != b[i]){
                    return false;
                    }

            }
        }
        return true;
    }
}
