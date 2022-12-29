package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
			// 0. JDBC Driver 호출
			Class.forName("org.mariadb.jdbc.Driver");// org.mariadb.jdbc라는 프로젝트 안에 Driver클래스
			// 1. DB연결
			DriverManager.getConnection("jdbc:mariadb://localhost:3306/empdb", "emp", "emp");
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않았습니다.");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} // 3. preference > library > add jar > 다운 한 드라이버 연결.
	}

}
