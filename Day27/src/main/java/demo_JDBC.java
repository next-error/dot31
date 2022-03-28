package main.java;

import java.sql.*;

public class demo_JDBC {
    /*
    1.注册驱动
    java.sql.Driver
    2.获取链接
    java.sql.DriverManger
    3.获取执行sql语句的对象
    java.sql.Connection
        createStatement方法 创建Statement对象将sql语句发送到数据库
    4.执行sql语句
    java.sql.Statement
        int executeUpdate (String sql) 返回影响的行数   sql--增删改
        ResultSet executeQuery(String sql)  sql--查询 返回ResultSet结果集合,它没有重写tostring,需要处理结果集
    5.处理结果

     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class<?> c = Class.forName("com.mysql.jdbc.Driver");
        //获取链接
        String url ="jdbc:mysql://localhost:3306/test04_emp";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url,username,password);
        //执行语句
        Statement statement = connection.createStatement();
/*        int i = statement.executeUpdate("INSERT dept1 VALUES (4,'cb')");
        System.out.println(i);*/
/*        int row = statement.executeUpdate("delete from dept1 ;");
        System.out.println(row);*/
/*        int row = statement.executeUpdate("update dept1 set dept_name ='bb' where id=1;");
        System.out.println(row);*/
        ResultSet resultSet = statement.executeQuery("select * from dept1;");
        //根据列名获取
/*        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String dept_name = resultSet.getString("dept_name");
            System.out.println(id+" "+dept_name);
        }*/
        //根据索引获取
        while (resultSet.next()) {
            int gid = resultSet.getInt(1);
            String gname = resultSet.getString(2);
            System.out.println(gid + "  " + gname);
        }

    }
}
