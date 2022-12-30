package member_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jdbc.ConnectionInform;

public class MemberDAO {
	int insertMember(MemberDTO dto) {
		Connection con = null;
		PreparedStatement pt = null;
		int count = 0;
		try {
			Class.forName(ConnectionInform.DRIVER_CLASS);
			// 1.DB연결
			con = DriverManager.getConnection(ConnectionInform.JDBC_URL, ConnectionInform.USERNAME,
					ConnectionInform.PASSWORD);
			String sql = "insert into member values(?,?,?,?,?,?, now())";
			pt = con.prepareStatement(sql);
			pt.setString(1, dto.getId());
			pt.setString(2, dto.getPw());
			pt.setString(3, dto.getName());
			pt.setString(4, dto.getPhone());
			pt.setString(5, dto.getEmail());
			pt.setString(6, dto.getAddress());
			count = pt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pt.close();
				con.close();
			} catch (Exception e) {
			}
		}
		return count;
	}
}
