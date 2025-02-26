package JDBC;

import java.sql.*;

public class AddingMultiple {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        String sql = "insert into users(username,email,password_hash) values (?, ?, ?)";
        String users[][] = {
                {"AdbulAsiya18", "abdulasiya18@gmail.com", "Hash12345678"},
                {"AsiyaShaikh18", "asiyashaikh18@gmail.com", "Hash1234567890"},
                {"Bajishaik19", "bajishaikh18@gmail.com", "Hash1234567890987654321"},
        };

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = connection.prepareStatement(sql);
        ) {
            for (String[] user : users) {
                pstmt.setString(1, user[0]);
                pstmt.setString(1, user[1]);
                pstmt.setString(1, user[2]);
                pstmt.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
