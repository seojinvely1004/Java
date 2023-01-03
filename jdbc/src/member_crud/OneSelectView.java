package member_crud;

import java.util.Scanner;

public class OneSelectView implements View {
	MemberDTO dto;

	public MemberDTO getDto() {
		return dto;
	}

	@Override
	public void input() {
		Scanner key = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = key.next();
		System.out.print("암호 입력 : ");
		String pw = key.next();

		MemberDAO dao = new MemberDAO();
		dto = dao.getMember(id, pw);
		// id 일치하면 pw 일치하면 - 정보 저장 리턴
		// id 일치하면 pw 불일치하면 - "4번 암호 맞지 않습니다"(id만 저장)
		// id 불일치하면 - "1번 회원가입부터 하세요"(dto null)
		// System.out.println("'" + dto.getId() + "'");
		if (dto != null && dto.getPw() != null) {
			System.out.println(dto);
		}
	}

}

