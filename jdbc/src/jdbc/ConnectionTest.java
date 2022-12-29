package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	final static String DRIVER_CLASS = "org.mariadb.jdbc.Driver";
	final static String JDBC_URL = "jdbc:mariadb://localhost:3306/empdb";
	final static String USERNAME = "emp";
	final static String PASSWORD = "emp";
	public static void main(String[] args) {
		Connection con = null;
		try {
			// 0. JDBC Driver 호출
			Class.forName(DRIVER_CLASS);
			// 1. DB연결
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			System.out.println("연결성공");
			// 04.
			con.close();
			System.out.println("연결 해제 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않았습니다.");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
				con.close();// 3. preference > library > add jar > 다운 한 드라이버 연결.
			} catch (SQLException e) {
			}
		}
	}
}
