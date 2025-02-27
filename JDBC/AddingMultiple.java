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
                {"Bajishaik19", "bajishaikh18123@gmail.com", "Hash1234567890987654321"},
                {"Bajishaik19","bajishaikh1972@gmail.com", "Hash12346543"},
        };

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = connection.prepareStatement(sql);
        ) {
            connection.setAutoCommit(false);
            for (String[] user : users) {
                pstmt.setString(1, user[0]);
                pstmt.setString(2, user[1]);
                pstmt.setString(3, user[2]);
                pstmt.addBatch();
            }

            int[] rowsInserted = pstmt.executeBatch();
            System.out.println("All Users Added..");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
