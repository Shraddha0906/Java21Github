package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    public static Connection getConn(){
        Connection connection;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","Shraddha@0906");

        } catch (ClassNotFoundException |SQLException e) {
            throw new RuntimeException(e);

        }
        return connection;
}
    }
