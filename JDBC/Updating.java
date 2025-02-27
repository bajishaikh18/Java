package JDBC;

import java.sql.*;

public class Updating {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        String sql = "update users set username = ? where username = ? ";

        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            pstmt.setString(1, "AsiyaBaji");
            pstmt.setString(2, "AdbulAsiya18");

            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated Successfully..");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
