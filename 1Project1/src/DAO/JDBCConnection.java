package DAO;

import java.sql.*;

public class JDBCConnection {
	public static Connection getJDBCConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String URL = "jdbc:mysql://localhost:3306/librarysys?autoReconnect=true&useSSL=false";
		String user = "root";
		String pass = "16021999";

		try {
			Class.forName(driverName);
			return DriverManager.getConnection(URL, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
