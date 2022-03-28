package main.java;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/*
     JDBC工具类
          获取连接
          关闭资源
 */
public class JDBCUtils {
    private static String url;
    private static String username;
    private static String password;
    private static String className;

    private JDBCUtils(){

    }

    public static void main(String[] args) throws SQLException {
        getConnection();
    }
    static{
        try {
            //将成员变量赋予值
            init();

            //注册驱动
            Class.forName(className);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void init() throws IOException {
        Properties p = new Properties();
        //获取src下的配置文件 当前类.class.getClassLoader().getResourceAsStream("文件名");
        InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc_util.properties");
        p.load(in);
        in.close();

        className = p.getProperty("className");
        url =  p.getProperty("url");
        username = p.getProperty("username");
        password = p.getProperty("password");
    }


    //获取数据库连接的方法
    public static Connection getConnection() throws SQLException {

        Connection con = DriverManager.getConnection(url, username, password);
        return  con;
    }

    //关闭资源的方法
    public static void close(ResultSet rs, Statement stat,Connection con){
        try {
            if(rs!=null)
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(stat!=null)
                stat.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
