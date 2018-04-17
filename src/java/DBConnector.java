package java;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {
	private Connection connection = null;
	
	//Constants
	private static final String IP	     = "localhost";
	private static final String PORT     = "3306";
	public  static final String DATABASE = "glarmester";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";	     	
	
	public DBConnector() throws Exception {
   		Class.forName("com.mysql.jdbc.Driver").newInstance();
   		String url = "jdbc:mysql://" + IP + ":" + PORT + "/" + DATABASE + "?useSSL=false";
   		this.connection = (Connection) DriverManager.getConnection(url, USERNAME, PASSWORD);
	}
	
	public Connection getConnection() {
   		return this.connection;
	}

}