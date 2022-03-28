package com.doit.PM_OutputStreamWriter;

import java.io.*;

public class demo01 {
    /*
    转换流;字符通往字节的桥梁
    方法:
        write:写字符 字符数组(一部分) 字符串
    构造方法:
        传参传入:OutputStreamWriter 及 指定编码
        不写编码会有默认编码
     */
    public static void main(String[] args) throws IOException {
        Writer w = new OutputStreamWriter(new FileOutputStream("d:\\g\\aaa\\gbk.txt",true),"gbk");
        w.write("历史");
        w.close();
    }
}
