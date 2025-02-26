package JDBC;

import java.sql.*;

class Reading {
    public static void main(String[] args) {
        // variables
        String url = "jdbc:mysql://localhost:3306/salessavvy";
        String username = "root";
        String password = "1234";

        // JDBC variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Loading Drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establishing the Connection
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to DataBase");

            //Statements
            statement = connection.createStatement();
            String query = "SELECT * from users";
            resultSet = statement.executeQuery(query);

            //Displaying the Result
            while (resultSet.next()) {
                System.out.println("Column 1 : " + resultSet.getString("username"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{if (connection != null) connection.close();} catch (Exception e) {}
            try{if (resultSet != null) resultSet.close();} catch (Exception e) {}
            try{if (statement != null) statement.close();} catch (Exception e) {}
        }
    }
}