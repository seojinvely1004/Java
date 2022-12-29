package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTEST2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);// 0. JDBC Driver 호출
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);// 1. DB연결
			System.out.println("연결성공");
			System.out.println(con.getAutoCommit()); // TRUE;

			/*
			 * Scanner key = new Scanner(System.in); System.out.println("상품명 : "); String
			 * name = key.nextLine(); System.out.println("가격 : "); int price =
			 * key.nextInt(); System.out.println("수량 : "); int balance = key.nextInt();
			 */

			// ------> users 테이블에서 용산구 주소를 가진 사용자 아이디, 주소를 조회.
			String sql = "select user_id, address from users where address likd '%용산구%'";

			System.out.println("삽입행의 갯수=" + rs);
			rs = st.executeQuery(sql);
			int line = 0;
			while (rs.next()) {
				++line;
				String user_id = rs.getString("user_id");
				String address = rs.getString("address");
				System.out.printf("%d 아이디:%d 주소:%s \n", line, user_id, address);
			}
			con.close();
			System.out.println("연결 해제 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 드라이버가 발견되지 않았습니다.");
		} catch (SQLException e) {
			System.out.println("연결 정보를 확인하세요");
		} finally {
			try {
				rs.close();
				st.close();
				con.close();// 3. preference > library > add jar > 다운 한 드라이버 연결.
			} catch (SQLException e) {
			}
		}
	}
}
