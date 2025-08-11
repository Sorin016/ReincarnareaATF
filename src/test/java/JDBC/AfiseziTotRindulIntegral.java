package JDBC;

import java.sql.*;

public class AfiseziTotRindulIntegral {
    public static void main(String[] args) throws Exception {
        String query = "select * from persons where PersonID=3;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            ResultSetMetaData meta = resultSet.getMetaData();
            int colCount = meta.getColumnCount();

            System.out.println("─────────────── RÂND SELECTAT ───────────────");
            for (int i = 1; i <= colCount; i++) {
                System.out.printf("%-15s : %s%n",
                        meta.getColumnName(i),
                        resultSet.getString(i));
            }
            System.out.println("─────────────────────────────────────────────");
        }
    }
}
