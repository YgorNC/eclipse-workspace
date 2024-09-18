package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static Connection conn;

	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/CADASTRO";
		String user = "root";
		String password = "Yo&kr4!le";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch(SQLException | ClassNotFoundException e){
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		conn = new DBConnection.getConnection();
		System.out.println("Conexão aberta!");
	}
}
