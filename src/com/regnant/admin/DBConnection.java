package com.regnant.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getDBConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/the_smart_chits", "Ravi",
					"ravi@121");

		} catch (ClassNotFoundException e) {
			System.out.println("class not found ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("SQL exception in connection");
		}

		return connection;
	}
}
