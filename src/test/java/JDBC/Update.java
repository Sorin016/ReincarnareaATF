package JDBC;

import java.sql.*;

public class Update {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate("update Persons set PersonID=4 where LastName='negara'");
        System.out.println("Rânduri actualizate: " + result);

    }
}
