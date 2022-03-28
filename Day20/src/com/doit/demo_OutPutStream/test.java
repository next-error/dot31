package com.doit.demo_OutPutStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class test {
    /*
    OutPutStream:抽象类,FileOutPutStream子类
    构造方法:既可以传入File类型也可以传入String类型的path,没有文件会创建文件,第二个字符需要传入true,不然会重新生成新文件覆盖旧文件
    方法:write:每次写入一个字节,根据ASS-II码表;
        重载:写入byte数组,可以指定开始和结束索引,左右都包含
            快速写入一个字符串
        close:执行完必须close,不然内存会一直占用该文件
    异常处理:创建对象和写入操作需要放入,避免报错
            finally写上close,为了避免空指针异常,需要做一个判断
     */
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream(new File("d:\\g\\aaa\\a.txt"));//没有文件创建,有文件覆盖
    //写入一个字节
    fout.write(97);
    fout.write('1');
    fout.write(48);
    fout.write(48);
    //写一个字节数组
        byte [] b1 = {65,66,67,68};
        fout.write(b1);
    //写入部分数组
        fout.write(b1,1,2);
    //快捷方式:字符串转化为字节数组
    fout.write("你好,世界".getBytes(StandardCharsets.UTF_8));

    //追加写入与换行
        FileOutputStream fout1 = new FileOutputStream(new File("d:\\g\\aaa\\a1.txt"),true);//追加写入,不会覆盖源文件
        fout1.write("大黄\r\n".getBytes(StandardCharsets.UTF_8));
        fout1.close();
        //异常处理
        OutputStream out1 =null;
        try {
            out1 =new FileOutputStream(new File("d:\\g\\aaa\\a2.txt"),true);
            out1.write("aaa\r\n".getBytes());
        }
        catch (IOException e){
            System.out.println(e);
        }
        finally {
            if (out1!=null) {
                out1.close();
            }
        }


    }
}
