package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.Messaging.SyncScopeHelper;

public class connect {
	String url = "jdbc:oracle:thin:@localhost:1521:dbDongY";
	String user = "system";
	String password = "123456";
	public Connection connection;
	Statement statement;

	public boolean ketNoi() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
		}

		if (connection == null) {

			throw new NullPointerException("Connection is null");
		}
		return true;
	}



		public void CreateStatement() {
			if (statement == null) {
				try {
					statement = connection.createStatement();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		public ResultSet xxx(String sqlCommand) {

			try {
				CreateStatement();
				ResultSet resultSet = statement.executeQuery(sqlCommand);
				return resultSet;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;

		}
		

	
		
	
}
