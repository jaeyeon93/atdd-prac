package com.example.MyATDD.domain;

import java.sql.Connection;
import java.sql.DriverManager;

public interface ConnectionMaker {
//    public Connection makeConnection() throws Exception {
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection c = DriverManager.getConnection("jdbc:mysql://jimmydb", "jimmy", "12345");
//        return c;
//    }
    public abstract Connection makeConnection() throws Exception;
}
