package mybatis;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MemberMain {

	public static void main(String[] args) throws IOException {
		//mybatis/mybatis-config.xml
		//1.mybatis설정파일 읽을 객체 준비
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		//2.mybatis-config.xml 설정대로 연결(factory로 bean을 가져옴)
		SqlSessionFactory factory = builder.build
		(Resources.getResourceAsReader("mybatis/mybatis-config.xml"));
		//3. db connection
		SqlSession session = factory.openSession();//db connection
		
		MemberDAO dao = new MemberDAO();
		dao.setSession(session);//4,5를 session이 전달.
		
		MemberService service = new MemberServiceImpl();//impl타입의 객체생성하여 service에 DAO를준다
		((MemberServiceImpl)service).setDao(dao);
		//////////////////////////////////////////////main>service>dao
		//test1 - 리스트 조회
		/*
		 * List<MemberDTO> list = service.memberlist(); for(MemberDTO m : list) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()); }
		 */
		/*//4.sql-mapping.xml에 정의 한 id=memberlist resultTyp"mybatis.MemberDTO"select호출
		List<MemberDTO> memberlist = session.selectList("member.memberlist");
		//5.조회
		for(MemberDTO m : memberlist) {
			System.out.println(m.getId()+":"+m.getPw()+":"+m.getName());*/
		//test2-조회 int
		System.out.println("전체 회원수 = "+service.membercount());
	}
	
}
