package com.doit.File;

import java.io.File;
import java.io.IOException;

public class myFile {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);// \
        System.out.println(File.pathSeparator);// ;
        String path = "aaa" + File.separator + "bbb" + File.separator + "1.txt";
        System.out.println(path);

        //File
        //构造方法,可以是文件也可是文件夹,不检查路径是否存在
        File f1 = new File(path);
        System.out.println(f1);
        File f2 = new File("d:\\g", "1.txt");
        System.out.println(f2);
        System.out.println(f2.createNewFile());//只能创建文件,
/*        File f3 = new File(path,"1.txt");
        System.out.println(f3);
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);*/
        //创建文件与文件夹
        File f4 = new File("d:\\g\\aaa\\bbb\\ccc\\ddd", "a.txt");
        System.out.println(f4.mkdirs());
        File f5 = new File("d:\\g\\aaa\\bbb\\ccc\\ddd\\vvv.txt");
        System.out.println(f5.createNewFile());

        //删除空文件或文件
        //System.out.println(f5.delete());
        //判断路径是否存在
        System.out.println(f4.exists());
        //判断文件是否存在:文件夹和不存在都返回false
        System.out.println(f4.isFile());
        System.out.println(f5.isFile());
        if (f5.exists()) {
            if (f5.isFile()) {
                System.out.println("是文件");
            } else {
                System.out.println("是文件夹");
            }
        } else {
            System.out.println("不存在");}
            System.out.println("+++++++++++++++++++++++++++++");
            //获取 绝对路径 构造方法写的路径  文件名  文件字节数  父路径  不会检查路径是否真的存在
            System.out.println(f5.getAbsolutePath());
            System.out.println(f5.getPath());

            System.out.println(f5.getName());
            System.out.println(f5.length());

        System.out.println(f5.getParentFile());

        //获取文件下所有文件名 获取当前文件夹下所有文件对象 操作对象必须是真实存在文件路径
        System.out.println("________________");
        File f6 = new File("d:\\g");
        String[] list = f6.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = f6.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
