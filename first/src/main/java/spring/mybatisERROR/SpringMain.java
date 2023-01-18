package spring.mybatis;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) throws IOException {
		
		ApplicationContext factory = 
				new ClassPathXmlApplicationContext("spring/mybatis/spring-mybatis.xml");
		//spring설정파일읽어와라
		
		/*String names[] = factory.getBeanDefinitionNames();
		 * System.out.println("==================="); for(String n : names) {
		 * System.out.println(n);
		 * 
		 * } System.out.println("===================");
		 */
		
		MemberService service = (MemberService)factory.getBean("service");
		
		//////////////////////////////////////////////main>service>dao
		//test1 - 리스트 조회
		
		  List<MemberDTO> list = service.memberlist(); 
		  for(MemberDTO m : list) {
		  System.out.println(m.getId()+":"+m.getPw()+":"+m.getName()); }
		 
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
		/*1. id회원이 작성 글이 있는지 검사
		 * 2. 글이 있으면 사용자 탈퇴 전에 글도 삭제하겠습니까? y/n
		 * 3_1. 사용자 탈퇴처리
		 * 3_2. 사용자 탈퇴취소
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
		/*
		 * List<HashMap<String,String>> boardlist = service.memberboard("mybatis");
		 * for(HashMap map : boardlist) { Set<String> keys = map.keySet();//키를가져온다 /
		 * map에 들어가있는 key들만 모은 것. 중복될 수 없으므로 Set으로 관리한다. for(String s:keys) {
		 * System.out.println(s + " : " + map.get(s));// 키에대한 값을 가져온다 } }
		 */
	}
}
