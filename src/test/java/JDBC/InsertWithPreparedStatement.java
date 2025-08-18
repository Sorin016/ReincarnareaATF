package JDBC;

import java.sql.*;

public class InsertWithPreparedStatement {
    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
        PreparedStatement preparedStatement = connection.prepareStatement("insert into Persons (PersonID, LastName) values (?,?);");
        preparedStatement.setInt(1,7);
        preparedStatement.setString(2,"negara");
        preparedStatement.executeUpdate();
    }
}
