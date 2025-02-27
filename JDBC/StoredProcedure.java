package JDBC;

import java.sql.*;

public class StoredProcedure {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        // Calling the stored procedure
        String sql = "{ CALL InsertUser(?, ?, ?) }";

        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                CallableStatement stmt = conn.prepareCall(sql)
        ) {
            stmt.setString(1, "john_doe1");
            stmt.setString(2, "john@exa2mple.com");
            stmt.setString(3, "hashed_pa2ssword123");

            stmt.execute();
            System.out.println("✅ User inserted successfully via Stored Procedure!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
