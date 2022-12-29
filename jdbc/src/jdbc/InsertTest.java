package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			// 0. JDBC Driver 호출
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1. DB연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			System.out.println("연결성공");
			Statement st = con.createStatement(); // sql저장 - 전송객체
			// emp_copy--> 100 길동 홍 1000 now() 50
			String sql = "insert into emp_copy values(400, '길동', '홍', 1000, now(), 50)";
			int rowcount = st.executeUpdate(sql);
			System.out.println("삽입행의 갯수=" + rowcount);

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
