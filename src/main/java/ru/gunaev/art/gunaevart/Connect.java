
package ru.gunaev.art.gunaevart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Connect {
    
    String user = "root";
    String pass = "";
    String url = "jdbc:mysql://localhost:3306/test?serverTimezone=Europe/Moscow";
    
    public  void createTable(String table) throws Exception
    {
        Connection connect = DriverManager.getConnection(url, user, pass);
        String sql = "CREATE TABLE ? (id INT NOT NULL AUTO_INCREMENT, name VARCHAR (20) NOT NULL, PRIMARY KEY (id))";
        PreparedStatement stm = connect.prepareStatement(sql);
        stm.setString(1, table);

    }
    
    
    public static void main(String[] args) throws Exception {
        Connect connect = new Connect();

        connect.createTable("prise");
    }
    
}
