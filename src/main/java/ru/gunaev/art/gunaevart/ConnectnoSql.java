package ru.gunaev.art.gunaevart;

import java.sql.*;
import java.sql.DriverManager;


public class ConnectnoSql {
    public static Connection connect;
    public static Statement statement;
    public static ResultSet resultSet;
    public static PreparedStatement prepareStatement;


    public static void connectDb() throws Exception{
        connect = DriverManager.getConnection("jdbc:sqlite:test.db");
        System.out.println("База подключена");
    }
}
