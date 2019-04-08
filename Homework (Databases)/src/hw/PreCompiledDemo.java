package hw;

import java.sql.*;

public class PreCompiledDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		// Establish a connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/Salary-Data", "rew", "");
		System.out.println("Database connected");
		// Execute a statement
		String queryString = "select first Name, last Name, level, pay " + "from Salary";
		// Create a prepared statement
		PreparedStatement pstmt = connection.prepareStatement(queryString);
		// Assume these from a UI
		String ssn = "123-45-6780";
		String courseId = "123";
		pstmt.setString(1, ssn);
		pstmt.setString(2, courseId);
		ResultSet rset = pstmt.executeQuery();
		// Iterate through the result and print the student names
		while (rset.next())
			System.out.println(rset.getString(1) + "\t" + rset.getString(2) + "\t" + rset.getString(3));
		// Close the connection
		connection.close();
	}
}
