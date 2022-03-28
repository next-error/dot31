package main.java;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBC_util {
    private static String url;
    private static String user;
    private static String password;
    private static String className;


    /*
    实现sql的登录功能及关闭功能
     */

    //注册和链接配置步骤只需要一次,可以写在代码块中
    static{
        try {
            /*Properties p = new Properties();
            InputStream in = JDBC_util.class.getClassLoader().getResourceAsStream("jdbc_util.properties");
            p.load(in);
            in.close();
            className = p.getProperty("className");
            url = p.getProperty("url");
            user = p.getProperty("user");
            password = p.getProperty("password");

            Class<?> c = Class.forName(className);*/
            init();
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public static void init() throws IOException, ClassNotFoundException {
        Properties p = new Properties();
        InputStream in = JDBC_util.class.getClassLoader().getResourceAsStream("jdbc_util.properties");
        p.load(in);
        in.close();
        className = p.getProperty("className");
        url = p.getProperty("url");
        user = p.getProperty("user");
        password = p.getProperty("password");

        Class<?> c = Class.forName(className);
        //注册驱动

    }

    public static Connection log_in() throws SQLException, IOException, ClassNotFoundException {


        //链接
        Connection con = DriverManager.getConnection(url, user, password);
        return  con;
    }
    public static void close(ResultSet rs, Connection con, Statement sta){
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            sta.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
