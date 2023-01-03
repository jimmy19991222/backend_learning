package com.jieming.test;

import java.sql.*;

import static java.lang.System.*;

public class Testjdbc2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&characterEncoding=utf-8&useSSL=true";
        String username = "root";
        String password = "6873991999";

        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        // query
        String sql = "INSERT INTO users(id, `name`, `password`, email, birthday)\n" +
                "VALUES(?,?,?,?,?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, 3);
        preparedStatement.setString(2, "wenming");
        preparedStatement.setString(3, "980409");
        preparedStatement.setString(4, "wenming@qq.com");
        preparedStatement.setDate(5, new Date(new java.util.Date().getTime()));

        int i = preparedStatement.executeUpdate();

        if (i > 0){
            System.out.println("insert successfully!");
        }

        preparedStatement.close();
        connection.close();
    }
}
