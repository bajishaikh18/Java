package JDBC;

import java.sql.*;

public class FirstConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Established Connection");

            stmt = connection.createStatement();
            String query = "SELECT * FROM users";
            rs = stmt.executeQuery(query);

            while (rs.next()){
                System.out.println("Column1: " + rs.getString(1));
                System.out.println("Column2: " + rs.getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
