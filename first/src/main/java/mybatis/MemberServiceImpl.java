package mybatis;

import java.util.List;

public class MemberServiceImpl implements MemberService {

	MemberDAO dao;
	
	public void setDao(MemberDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<MemberDTO> memberlist() {
		return dao.memberlist();
		//DAO메소드 1개 - SQL1개 실행단위
		//서비스 메소드는 하나의 기능 -여러개 실행 단위
		//기능은service가 , 수행하는것은 dao가 sql.mapping.xml하도록 	
	}
	@Override
	public int membercount() {
		return dao.membercount();
	}

}
