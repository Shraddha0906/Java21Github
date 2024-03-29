package jdbc;

//import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int id;
            String name;

            System.out.println("Enter id,name");
            id = sc.nextInt();
            name = sc.next();
            //address= sc.next();
//            String insert = "insert into employee(id,name,address)values(?,?,?)";
            String update = "update employee set name=? where id=?";
            PreparedStatement preparedStatement = Conn.getConn().prepareStatement(update);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
//            preparedStatement.setString(3,address);

            int i = preparedStatement.executeUpdate();
            System.out.println(i + " row affected");

        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}

