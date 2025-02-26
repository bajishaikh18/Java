package JDBC;

import java.sql.*;

public class Adding {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        String insertQuery = "insert into users (username, email, password_hash) VALUES (?, ?, ?)";
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = conn.prepareStatement(insertQuery);

        ) {
            pstmt.setString(1, "Asiya18");
            pstmt.setString(2, "asiya18@gmail.com");
            pstmt.setString(3, "hash786187");

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
