package JDBC;

import java.sql.*;

public class rollBack {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, username, password);

        try {
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO users (username, email, password_hash) VALUES ('Bajishaik19','bajishaikh1972@gmail.com', 'Hash12346543')");
            statement.executeUpdate("INSERT INTO users (username, email, password_hash) VALUES ('Bajishaik20','bajishaikh19772@gmail.com', 'Hash12346543')");
            System.out.println("All users added sucessfully..");
            connection.commit();
        } catch (SQLException e) {
            connection.rollback();
            e.printStackTrace();
        } finally {
            connection.setAutoCommit(true);
        }
    }
}
