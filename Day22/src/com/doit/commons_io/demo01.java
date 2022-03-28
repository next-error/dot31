package com.doit.commons_io;

import org.apache.commons.io.IOUtils;

import java.io.*;

public class demo01 {
    public static void main(String[] args) {
        InputStream in=null;
        OutputStream out=null;
        try {
             in = new FileInputStream("d:\\g\\aaa\\Java核心技术·卷 I（原书第11版） 基础知识 by 凯 S.霍斯特曼 (z-lib.org).pdf");
            out = new FileOutputStream("d:\\g\\aaa\\bbb\\Java核心技术·卷 I（原书第11版） 基础知识 by 凯 S.霍斯特曼 (z-lib.org).pdf");
            IOUtils.copy(in,out);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);

        }
    }
}
