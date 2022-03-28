package com.doit.Test01;

public class test {
    public static void main(String[] args) {
        Fu F = new Fu() {
            @Override
            public void method() {

            }
        };
        /*
        String方法总结:
        1.字符串类型与数组的转换: 字符数组和字节数组
            字符串转化为数组: char [] c = new String ().toCharArray ();
                         ???  byte [] b = new String ().toByteArray();
            ??????数组转化为字符串: new String(new char []);
            字符串转化为字符数组: String [] s = "a-b".split.("-")
        2. 大小写转化 以xxx开头or结尾 长度(方法)
        3. 索引 indexOf: 可以传入int char String类型 传入内容返回索引 没有返回-1
               charAt:   传入索引返回内容//超过长度会报错!!!!
        4. 替换 replace 返回一个新的字符串,需要接收,和数组复制不同  可以传入字符或字符串
        5. 截取 substring 一个参数时从开头截取到末尾  两个字符时有开始和结束索引,左闭右开
         */
        String s = "aaaaaaabgraaaad";
        System.out.println(s.indexOf("y"));
        System.out.println(s.charAt(1));
/*        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }*/
        System.out.println(s);
        System.out.println(s.replace("a+", ","));//全部替换了,一堆逗号 若多一个+ 啥也不换了
        System.out.println(s.replaceAll("a", ","));//也是一堆
        System.out.println(s.replaceAll("a+", ","));//变为一个
        System.out.println(s.substring(1));

        //冒泡排序与二分查找
        int[] list1 = {2, 5, 6, 4, 1, 4, 6, 8, 42, 54, 56, 112};
        for (int i = 0; i < list1.length - 1; i++) {
            for (int j = 0; j < list1.length - 1 - i; j++) {
                if (list1[j] > list1[j + 1]) {
                    int bmp = list1[j];
                    list1[j] = list1[j + 1];
                    list1[j + 1] = bmp;
                }
            }
        }
/*        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }*/
        System.out.println(aa(4, list1));
    }

    //二分查找
    public static int aa(int key, int[] list1) {
        int max = list1.length - 1;
        int min = 0;
        while (max >= min) {
            int mid = (max + min) / 2;
            if (key > list1[mid]) {
                min = mid + 1;
            } else if (key < list1[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

}
