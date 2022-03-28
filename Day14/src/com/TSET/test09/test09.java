package com.TSET.test09;

import java.util.Arrays;

public class test09 {
    public static void main(String[] args) {
        String s = "Hello AbcDe";
        byte[] bytes = s.getBytes();
        byte[] by1 = new byte[5];
        System.arraycopy(bytes, bytes.length - 5, by1, 0, 5);

        Arrays.sort(by1);
/*        for (byte b:by1){
            System.out.println(b);
        }*/
        byte[] by2 =new  byte[3];
        System.arraycopy(by1,2,by2,0,3);
        Arrays.sort(by2);
        String s1 =new String(by2);
        System.out.println(s1.indexOf('c'));

    }
}

