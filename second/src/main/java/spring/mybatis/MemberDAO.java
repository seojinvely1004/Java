package spring.mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
@Mapper
@Repository("memberdao")
public interface MemberDAO {

	public List<MemberDTO> memberlist();
	public int membercount();	
	public MemberDTO onemember(String id) ;	
	public List<MemberDTO> paginglist(int[] limit);	
	public int insertmember(MemberDTO dto);
	public int updatemember(MemberDTO dto);
	public int deletemember(String id);
	public List<MemberDTO> searchmember(HashMap map);
	public List<MemberDTO> addresssearch(ArrayList<String> addresslist);
	public List<MemberDTO> combination(MemberDTO dto);
	public List<HashMap<String, String>> memberboard(String writer);
	public int updatemember2(MemberDTO dto);
}










