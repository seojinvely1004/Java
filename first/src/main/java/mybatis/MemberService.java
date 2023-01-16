package mybatis;

import java.util.List;

public interface MemberService {
	public List<MemberDTO> memberlist();
	public int membercount();
	public MemberDTO onemember(String id);
	public List<MemberDTO> paginglist(int[] limit);
	public int insertmember(MemberDTO dto);
}
