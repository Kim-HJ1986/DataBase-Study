package postgresql_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnDB {
	private static final String URL = "jdbc:postgresql:postgres"; //url 은 자원이다.
	private static final String USER_ID = "postgres"; 
	private static final String PASSWORD = "1234"; 
	
	private static void conn() {
		try {
			//주어진(매개변수) 문자열을 기준으로 클래스 찾기
			Class.forName("org.postgresql.Driver");
			System.out.println("Success");
			Connection connection = DriverManager.getConnection(URL, USER_ID, PASSWORD);
			System.out.println("Connection Success");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		conn();
	}

}
