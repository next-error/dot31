package com.doit.review;

public class review {
    /*
    IO流:
            IO流的命名规则: 一般情况都是前面是这个流能干什么 后面是这个流的顶级父类是谁
    字节流:可以操作任何类型的文件,由输入和输出可以复制文件,操作中文时可能会乱码:utf-8中一个汉字是三个字节,若被分开则显示乱码
    字节输入流:InputStream-->子类:FileInputStream
                将硬盘文件加载到内存中
                构造方法:传入File对象或者String类型的硬盘地址
                方法:
                        read:一个字节一个字节的读取,直接和操作系统交互;
                            while循环一个字节一个字节的与操作系统交互读取，此时返回值为读取的数据
                            while循环btye数组与操作系统交互读取          此时返回值为本次读取数据的个数
                        close:运行完后需要关闭该流
                异常处理:IOException,将close放在finally位置,还有避免其空指针
    字节输出流:OutPutStream-->子类:FileOutPutStream
                将内存中的内容写入硬盘中
                构造方法:传入File对象或者String类型的硬盘地址,true  可以不覆盖源文件继续写入数据
                方法:
                        write:一个字节一个字节的写入,直接和操作系统交互,  没有返回值!!!!
                                while循环一个字节一个字节的写入.
                                      while循环byte数组与操作系统交互.
    字符流:只可以操作文本文件
    字符输入流:Reader-->FileReader
                构造方法:
                方法:
                        read:每次读取一个字符,直接和操作系统交互
                                while一个字符一个字符的循环读取,返回值为读取的字符
                                while一个char数组读取,返回的是本次读取的个数
                        close
    字符输出流:Writer-->FileWriter
                构造方法:
                方法:
                        write:一个字符一个字符的写入
                              一个字符数组写入
                              字符串写入
                        flush:刷新,将缓存区的内容写入硬盘
                        close:close前会自带一次刷新
IO流与双列集合properties的交互:
            load:
                定义集合p
                采用字符或字节输入流r输入
                p.load(r)
                关闭流:r.close(要try ...catch)
     */
}
