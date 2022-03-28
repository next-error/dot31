package com.doit.Copy;

import java.io.*;

public class MyCopy {
    public static void main(String[] args) throws IOException {
        //对文件赋值粘贴
        //1.确认源文件路径及目标路径
        //2.读取并写入
        File srcFile = new File("d:\\duoyi\\Java核心技术·卷 I（原书第11版） 基础知识 by 凯 S.霍斯特曼 (z-lib.org).pdf");
        File dec = new File("d:\\g\\aaa");
        String fileName = srcFile.getName();
        File decFile = new File(dec,fileName);

        copy(srcFile,decFile);
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
/*        in.close();
        out.close();*/
        //使用工具类关闭资源
        IO_Tools.shutdown(in,out);
    }

}
