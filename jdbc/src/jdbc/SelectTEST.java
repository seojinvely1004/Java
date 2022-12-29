package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTEST {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);// 0. JDBC Driver 호출
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);// 1. DB연결
			System.out.println("연결성공");
			System.out.println(con.getAutoCommit()); // TRUE;

			Statement st = con.createStatement(); // sql저장 - 전송객체 // emp_copy--> 100 길동 홍 1000 now() 50

			/*
			 * Scanner key = new Scanner(System.in); System.out.println("상품명 : "); String
			 * name = key.nextLine(); System.out.println("가격 : "); int price =
			 * key.nextInt(); System.out.println("수량 : "); int balance = key.nextInt();
			 */

			String sql = "select employee_id, first_name, last_name, salary, hire_date from employees";// 107개레코드 * 11컬럼
			ResultSet rs = st.executeQuery(sql);// select할때쓰는메서드, 리던은 resultset타입(행과열의일차원적인테이블구조)
			// int rowcount = st.executeUpdate(sql); //insert할때쓰는메서드임
			System.out.println("삽입행의 갯수=" + rs);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2) + "-" + rs.getString(3);
				double salary = rs.getDouble("salary");
				java.sql.Date d = rs.getDate("hire_date");
				String d2 = rs.getString("hire_date");
				System.out.printf("사번:%d 이름:%s 급여:%f 입사일:%s \n", id, name, salary, salary, d2);
			}

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
