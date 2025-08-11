package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AfiseziDoarOColoana {
    public static void main(String[] args) throws Exception {
        String query = "select * from persons where PersonID=3;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        resultSet.next();

        String ss = resultSet.getString("LastName");
        System.out.println(ss);
        statement.close();
        connection.close();
    }
}
