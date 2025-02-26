package JDBC;

import java.sql.*;

public class Removing {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        String sql = "delete from users where username = ?";

        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement pstmt = connection.prepareStatement(sql);
        ) {
            pstmt.setString(1, "Bajishaik19");
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("The User Deleted Sucessfully..");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
