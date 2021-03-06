package in.radwan.util;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class DBConnectionUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/employeedirectory";

	private static final String DRIVER = "com.mysql.jdbc.Driver";

	private static final String USERNAME = "root";

	private static final String PASSWORD = "";

	private static Connection connection = null;

	public static Connection openConnection() {

		if (connection != null) {

			return connection;
		} else {

			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}

			try {
				connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (SQLException e) {

				e.printStackTrace();
			}

			return connection;

		}

	}

}
