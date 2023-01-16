package mybatis;

import java.util.List;

public interface MemberService {
	public List<MemberDTO> memberlist();
	public int membercount();
}
