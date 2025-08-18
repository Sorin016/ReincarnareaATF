package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
        Statement statement = connection.createStatement();
        int result = statement.executeUpdate("insert into Persons values (5,\"cirita\",\"matei\",\"miorita\",\"chisinau\");");
        System.out.println("Rânduri actualizate: " + result);
    }
}
