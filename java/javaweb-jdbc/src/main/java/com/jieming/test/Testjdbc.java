package com.jieming.test;

import java.sql.*;

public class Testjdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "6873991999";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        // CRUD based on statement
        Statement statement = connection.createStatement();

        // query
        String sql = "SELECT * from users";

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()){
            System.out.println("id:" + resultSet.getObject("id"));
            System.out.println("name:" + resultSet.getObject("name"));
            System.out.println("password:" + resultSet.getObject("password"));
            System.out.println("email:" + resultSet.getObject("email"));
            System.out.println("birthday:" + resultSet.getObject("birthday"));
        }

        // delete
        String sql_d = "DELETE from users where id = 3";

        int i = statement.executeUpdate(sql_d);

        System.out.println(i);

        resultSet.close();
        statement.close();
        connection.close();
    }
}
