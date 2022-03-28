package com.doit.copy;

import java.io.*;

public class MyCopy {
    public static void main(String[] args) throws IOException {
        //对文件赋值粘贴
        //1.确认源文件路径及目标路径
        //2.读取并写入
        long l1 = System.currentTimeMillis();
        File srcFile = new File("d:\\duoyi\\Java核心技术·卷 I（原书第11版） 基础知识 by 凯 S.霍斯特曼 (z-lib.org).pdf");
        File dec = new File("d:\\g\\aaa");
        String fileName = srcFile.getName();
        File decFile = new File(dec,fileName);

        copy(srcFile,decFile);//3657
        //copy_buffer(srcFile,decFile);//4141
        copy_buffer1(srcFile,decFile);//605
        long l2 = System.currentTimeMillis();
        int t= (int)(l2-l1);
        System.out.println(t);

    }
    //使用缓冲流复制文件--字节数组
    public static void copy_buffer1(File secFile,File decFile) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(secFile));
        OutputStream out =new BufferedOutputStream(new FileOutputStream(decFile));
        byte[] bytes =new byte[1024];
        int len =0;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes);
        }
        in.close();
        out.close();
    }
    //使用缓冲流复制文件--字节
    public static void  copy_buffer (File secFile,File decFile) throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream(secFile));
        OutputStream out =new BufferedOutputStream(new FileOutputStream(decFile));
        int date =0;
        while ((date=in.read())!=-1){
            out.write(date);
        }
        in.close();
        out.close();
    }
    //使用字符数组
    public static void copy(File secFile,File decFile) throws IOException {
        InputStream in = new FileInputStream(secFile);
        OutputStream out = new FileOutputStream(decFile);
        byte [] bytes = new byte[1024];
        int len =0;
        while ((len=in.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        in.close();
        out.close();
        //使用工具类关闭资源
        //IO_Tools.shutdown(in,out);
    }

}