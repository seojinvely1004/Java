package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDAO {//DAO가 maybatis에 접속해라
	SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	public List<MemberDTO> memberlist(){
		return session.selectList("member.memberlist");
	}
	public int membercount(){
		return session.selectOne("member.membercount");
	}

}
