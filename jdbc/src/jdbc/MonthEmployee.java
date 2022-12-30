package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
public class MonthEmployee {
	ArrayList<String> getEmployees() throws ClassNotFoundException, SQLException {
		
		/*
		 *  제외할 월 : 3  
		 *  01- 12 사이 값 입력(03 3 둘다가능)
		 *  
		 *  월별 입사자들의 총 급여
		 *  입사월 급여 총합
		 *  01 xxx
		 *  02 xxx
		 *  03 입력받은 제외달 
		 *  04 xxx
		 *  PreparedStatement로 사용
		 * */
		
		ArrayList<String>  list =  new ArrayList();
		// 키보드 월 입력
		Scanner key = new Scanner(System.in);
		System.out.println("제외할 월: ");
		int inputmonth = key.nextInt();
		// sql
		String sql = "select substr(hire_date,6,2)입사월, sum(salary)급여총합 "
				+ "from employees "
				+ "where date_format(hire_date, '%m')!= ? "
				+ "group by month(hire_date) "
				+ "order by 입사월 ";
		///날짜 추출 dateformat(hire_date,'%c') %m 02붙여서  --  %c 1자리
		// jdbc전송
		Class.forName(ConnectionInform.DRIVER_CLASS);
		Connection con = DriverManager.getConnection(ConnectionInform.JDBC_URL,ConnectionInform.USERNAME,ConnectionInform.PASSWORD);
		PreparedStatement pt = con.prepareStatement(sql);
		pt.setInt(1, inputmonth);
		// sql또 보내면 안된다. ? 값 보내기
		ResultSet rs= pt.executeQuery();
		
		while(rs.next()) {
			int outputmonth = rs.getInt("입사월"); 
			double sum = rs.getDouble("급여총합");
			list.add(outputmonth+"\t"+sum);
		}
		// Arraylist
		rs.close();
		pt.close();
		con.close();
		return list;
	}
	
	public static void main(String[] args) {
		try {
			ArrayList<String>  list = 
					new MonthEmployee().getEmployees();
			System.out.println("입사월\t급여총합");
			
			for(String o : list) {
				System.out.println(o);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}