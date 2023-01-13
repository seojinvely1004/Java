package annotation.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("service1")  
public class MemberJanService implements MemberService {
	@Autowired
	MemberDAO memberdao ;
	
	@Autowired
	PointDAO  pointdao;
	
	public void registerMember() {
		boolean isLogin = memberdao.selectMember();
		if(!isLogin) {
			memberdao.insertMember();
			//pointdao.setPoint(10000);
			System.out.println(pointdao.getPoint() + " 포인트를 받았습니다.");
		}
		
	}
	
	public String registerMember(MemberDTO dto) {return null; }
	
	/*
	public void setMemberdao(MemberDAO memberdao) {
		this.memberdao = memberdao;
	}

	public void setPointdao(PointDAO pointdao) {
		this.pointdao = pointdao;
	}*/



}
