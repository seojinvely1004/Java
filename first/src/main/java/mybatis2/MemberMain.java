package mybatis;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

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
		//3. db connection. jdbc자동commit/mybatis 수동commit true로바꿈.
		SqlSession session = factory.openSession(true);//db connection
		
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
		//System.out.println("전체 회원수 = "+service.membercount());
		//test3 - 조회 (입력파라미터 존재, 결과 MemberDTO타입)
		/*
		 * MemberDTO m = service.onemember("mem1");//dto에 객체를 받아 id가 mem1인것을찾아와, if (m
		 * != null) { System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()); }
		 */
		//test4 - 페이징처리 리스트 조회
		/*
		 * int[] limit = {0,3}; List<MemberDTO> list = service.paginglist(limit);
		 * for(MemberDTO m : list) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()); }
		 */
		//test5 (indate제외한값6개. inddate는 now()함수로 매핑안에넣어줬으므로
		/*
		 * MemberDTO insertdto = new MemberDTO(); 
		 * insertdto.setId("mybatis");
		 * insertdto.setPw("mybatis"); 
		 * insertdto.setName("박대한");
		 * insertdto.setPhone("010"); 
		 * insertdto.setEmail("A@b.com");
		 * insertdto.setAddress("용산시 용산구"); 
		 * service.insertmember(insertdto);
		 */
		//test6 : updatemember sql실행 /id=mybatis인 대상(박대한)을  박한국으로, phone01087654321로, 이메일mybatis@b.com으로 변경
		/*
		 * MemberDTO updatedto = new MemberDTO(); updatedto.setId("mybatis");
		 * updatedto.setName("박한국"); updatedto.setPhone("01010041004");
		 * updatedto.setEmail("update@b.com"); updatedto.setAddress("용용시 업뎃구");
		 * service.updatemember(updatedto);
		 */
		
		//update 확인용
		/*
		 * int[] limit = {0,3}; List<MemberDTO> list = service.paginglist(limit);
		 * for(MemberDTO m : list) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()+":"+m.getEmail()+
		 * ":"+m.getAddress()); }
		 */
		//test7 :id mybatis를 삭제.
		/* int row = service.deletemember("mybatis");}
		 */
		
		//test8 : map
		/*
		 * HashMap<String, String> map = new HashMap(); map.put("colname", "indate");
		 * map.put("colvalue", "2023%"); //select * from member where ${colname} like
		 * #{colvalue} List<MemberDTO> searchlist = service.searchmember(map);
		 * for(MemberDTO m : searchlist) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()+":"+m.getEmail()+
		 * ":"+m.getIndate()); }
		 */
		//test9 : 주소로검색하기
		/*
		 * ArrayList<String> addresslist = new ArrayList(); addresslist.add("용산시 용산구");
		 * addresslist.add("마포구 합정동"); addresslist.add("용산시 용산구"); List<MemberDTO>
		 * resultlist = service.addresssearch(addresslist); for(MemberDTO m :
		 * resultlist) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()+":"+m.getEmail()+
		 * ":"+m.getIndate()); }
		 */
		/*select from member where address in
		 * <foreach collection="list" item="addr" open="("separator="," close=")">
		 * #{addr}
		 * </foreach>
		 */
		//test10 : 조합 + 동적 조건절
		/*
		 * MemberDTO dto = new MemberDTO(); dto.setName("박한국");
		 * //dto.setEmail("update@b.com"); List<MemberDTO> resultlist =
		 * service.combination(dto); for(MemberDTO m : resultlist) {
		 * System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()+":"+m.getEmail()+
		 * ":"+m.getPhone()+":"+m.getAddress()); }
		 */
		//test11 : join시 resultMap을이용하는 경우
		List<HashMap<String,String>> boardlist = service.memberboard("mybatis");
		for(HashMap map : boardlist) {
			Set<String> keys = map.keySet();//키를가져온다 / map에 들어가있는 key들만 모은 것. 중복될 수 없으므로 Set으로 관리한다.
			for(String s:keys) {
				System.out.println(s + " : " + map.get(s));// 키에대한 값을 가져온다
			}
		}
	}
}
