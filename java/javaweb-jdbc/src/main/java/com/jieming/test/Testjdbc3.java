package com.jieming.test;

import com.sun.media.jfxmediaimpl.HostUtils;
import org.junit.Test;

import java.sql.*;

public class Testjdbc3 {
    public static void main(String[] args)  {

    }

    @Test
    public void test()  {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "6873991999";

        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
    //        System.out.println("Hello, test!");
    //        System.out.println(1/0);

            // inform database to open the transaction
            connection.setAutoCommit(false); // same as sql "start transaction"
            String sql = "update account set money=money+100 where name='A'";
            connection.prepareStatement(sql).executeUpdate();

//            int i = 1/0;

            String sql2 = "update account set money=money-100 where name='B'";
            connection.prepareStatement(sql2).executeUpdate();
            connection.commit();

            System.out.println("commit succeed!");
        } catch (Exception e){
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
