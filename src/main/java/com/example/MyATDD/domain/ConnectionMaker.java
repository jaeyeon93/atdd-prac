package com.example.MyATDD.domain;

import java.sql.Connection;
import java.sql.DriverManager;

public interface ConnectionMaker {
    public abstract Connection makeConnection() throws Exception;
}
