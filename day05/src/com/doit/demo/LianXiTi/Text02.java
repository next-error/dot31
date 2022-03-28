package com.doit.demo.LianXiTi;

public class Text02 {
    public static void main(String[] args) {
        /*
        有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和，

      要求是：求和的元素个位和十位都不能是7，并且只能是偶数

         */
        int[] array = {68,27,95,88,171,996,51,210};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int ge = array[i]%10;
            int shi = array[i]/10%10;
            if ( array[i]%2 ==0 &&ge != 7 && shi !=7){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }
}
//