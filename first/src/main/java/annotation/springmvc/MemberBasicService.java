package annotation.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service2") 
public class MemberBasicService implements MemberService {
	@Autowired
	MemberDAO dao;
	
	/*public void setDao(MemberDAO dao) {
		this.dao = dao;
	}*/
	@Override
	public void registerMember() {
		boolean isLogin = dao.selectMember();
		if(!isLogin) {		dao.insertMember(); }

	}

	@Override
	public String registerMember(MemberDTO dto) {
		boolean isLogin = dao.selectMember(dto);
		if(!isLogin) {		
			dao.insertMember(dto); 
			return "회원가입되셨습니다.";
		}
		else {
			return "이전 가입된 적이 있습니다. " + dto.getId()+ " 회원님은 정상로그인되셨습니다.";
		}

	}
	

}
