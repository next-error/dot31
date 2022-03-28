package com.doit.Reviews;

import java.io.File;

public class review_File {
    /*
File:
        字段:
        构造方法:
        方法:
            delete:可以删除文件或者空的文件夹
            exists:判断文件或文件夹是否存在
            getAbsoluteFile:获得绝对路径,返回file类型
            getAbsolutePath:获得绝对路径,返回String类型
            getPath:获得抽象路径,返回String类型
            getName:
            isFile:判断是否是文件,文件夹和不存在都是false
            length:返回文件的字节数,文件夹???????
            mkdirs:创建文件夹,无法创建文件
            createNewFile:创建文件
            list:获得当前文件夹下的文件,返回String类型的数组
            listFile:获得当前文件夹下的文件,返回File类型的数组

     */

    public static void main(String[] args) {
        File   f1 = new File("d:\\g\\aaa\\11.txt")   ;
        System.out.println(f1.exists());

    }
}
