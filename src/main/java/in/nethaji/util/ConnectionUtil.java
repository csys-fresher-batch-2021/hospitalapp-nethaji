package in.nethaji.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.nethaji.exception.DBException;

public class ConnectionUtil {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String driverClass = "org.postgresql.Driver";

		String url = "jdbc:postgresql://localhost/Hospital_db";

		String username = "postgres";

		String password = "root";

		Class.forName(driverClass);

		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection created");
		return connection;
	}
	
	public static void close(Connection connection, PreparedStatement pst, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			throw new DBException("There no connection to close");
		}
	}
}
