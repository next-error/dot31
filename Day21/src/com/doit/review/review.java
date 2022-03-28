package com.doit.review;

public class review {
    /*
    缓冲流:缓冲流,也叫高效流，是对4个基本的FileXxx 流的增强
        BufferedInputStream: InputStream(超类)-->FileInputStream-->BufferedInputStream
            构造方法:(InputStream in)
            方法: int read()
                    int read(byte[] bytes,int off, int len)
                 void close()
        BufferedOutputStream: OutStream(超类)-->FileOutputStream-->BufferedOutputStream
            构造方法:(OutputStream out)
            方法: void write(int b)
                    void write(byte[] bytes,int off,int len)
                    void close()
        BufferedReader: Reader-->BufferedReader
            构造方法:(Reader in)
            方法: int read()
                  int read(char[] chars,int off,int len)
                  void close()
            特有方法: readline() 读一行数据
        BufferedWriter: Writer-->BufferedWriter
            构造方法: (Writer out)
            方法: void write()
                 void write(char[] chars,int off, int len)
                 void write(String s,int off, int len)
                 void flush() 刷新该流的缓冲
                 void close()
            特有方法:
                void newline()换行
    转化流:转换编码
        InputStreamReader: Reader-->InputStreamReader -->FileReader
            构造方法: (InputStream in, CharsetDecoder dec)传入编码格式,不区分大小写
            方法:  int read()
                  int read(char[] chars,int off,int len)
                  void close()
        OutputStreamWriter: Writer-->OutputStreamWriter -->FileWriter
            构造方法: (OutputStream out, CharsetDecoder dec)传入编码格式,不区分大小写
            方法: void write()
                 void write(char[] chars,int off, int len)
                 void write(String s,int off, int len)
                 void flush() 刷新该流的缓冲
                 void close()
    序列化:
        ObjectInputStream: 反序列化 InputStream-->ObjectInputStream
                从硬盘中读取序列化后的内容
            构造方法: (InputStream in)
            方法: readObject()

        ObjectOutputStream: 序列化 OutputStream-->ObjectOutputStream
                生成序列化的数据
            构造方法: (OutputStream out)
            方法: writeObject(Object obj)
        注意:若改变了属性的权限修饰符,反序列化会报错,需要重新序列化或自定义序列号
    打印流:
        PrintStream: OutputStream-->FileOutputStream-->PrintStream

     */
}
