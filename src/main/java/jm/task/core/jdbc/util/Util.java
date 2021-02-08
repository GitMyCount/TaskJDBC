package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    String user = "root";
    String password = "root";
    String url = "jdbc:mysql://localhost:3306/bzdnusers";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection = null;

    public Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            return connection;
        }
        return connection;
    }
}
