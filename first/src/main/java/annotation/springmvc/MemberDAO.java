package annotation.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("memberdao")
public class MemberDAO {
	@Autowired //dto1, dto2, dto3
	@Qualifier("dto2")   //spring , 1111
	MemberDTO dto;

	/* <property name="dto" ref="dto정의  bean id"> */
	//public void setDto(MemberDTO dto) {
		//dto1, dto2, dto3+ 하위클래스객체(ioc,구현 
		// dependency INJECTION
		//  1> SETTER  INJECTION
		//  2> CONSTRUCTOR INJECTION
	//	this.dto = dto;
	//}
	
	public boolean selectMember() {
		//MemberDTO - id spring 이고 pw 1111 이면 정상 로그인
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) {
			return true;
		}
		else {
			return false;
		}
	}
//controller-service-dao
	public boolean selectMember(MemberDTO dto) {
		//MemberDTO - id spring 이고 pw 1111 이면 정상 로그인
		if(dto.getId().equals("spring") && dto.getPw().equals("1111")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void insertMember() {
		System.out.println(dto.getId() + " 님 회원가입되셨습니다. ");
	}
	public void insertMember(MemberDTO dto) {
		System.out.println(dto.getId() + " 님 회원가입되셨습니다. ");
	}
}
