package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class Callable {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/salessavvy";
		String username = "root";
		String password = "1234";

		Connection connection = null;
		CallableStatement callableStatement = null;

		try {
			// Step 1: Establish a connection to the database
			connection = DriverManager.getConnection(url, username, password);

			// Step 2: Prepare the CallableStatement to call the stored procedure
			String sql = "{call CheckProductAvailability(?)}";
			callableStatement = connection.prepareCall(sql);

			// Step 3: Set the parameter for the stored procedure
			callableStatement.setString(1, "Apples");

			// Step 4: Execute the stored procedure
			boolean hasResults = callableStatement.execute();

			if (hasResults) {
				System.out.println("Stored procedure executed successfully and returned results.");
			} else {
				System.out.println("Stored procedure executed successfully but did not return results.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (callableStatement != null) {
					callableStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}