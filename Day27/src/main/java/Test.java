package main.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
登录功能
 */
public class Test {
    public static void main(String[] args)  {

        Connection con = null;
        PreparedStatement pre= null;
        ResultSet rs =null;
        try{
            con = JDBC_util.log_in();
            String sql = "select user_name ,user_password from zl_user;";
            pre = con.prepareStatement(sql);
            rs = pre.executeQuery();
            while (rs.next()){
                String user_name = rs.getString("user_name");
                String user_password = rs.getString("user_password");
                System.out.println(user_name+"  "+user_password);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        JDBC_util.close(rs,con,pre);
    }
}
