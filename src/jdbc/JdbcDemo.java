package jdbc;
  //registering drive

import java.sql.*;


public class JdbcDemo {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/shraddha","root","Shraddha@0906");
            Statement statement= connection.createStatement();
            String str="select * from employee";
            ResultSet rs = statement.executeQuery(str);
            while (rs.next()){
                System.out.println(rs.getInt("id")+""+rs.getString("name")+" "+rs.getString("adress"));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);



        }
    }
}
