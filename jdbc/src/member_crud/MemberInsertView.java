package member_crud;

import java.util.Scanner;

public class MemberInsertView implements View {

	@Override
	public void input() {
		Scanner key = new Scanner(System.in);
		System.out.println("아이디입력 : ");
		String id = key.next();
		System.out.println("암호 입력 : ");
		String pw = key.next();
		System.out.println("이름 입력 : ");
		String name = key.next();
		System.out.println("이메일 입력 : ");
		String email = key.next();
		System.out.println("폰 번호 입력 : ");// 폰번호입력 : xxxxx(엔터)
		String phone = key.next();
		key.nextLine();
		System.out.println("주소 입력 : ");
		String address = key.nextLine();// 공백있을수있으므로 nextLine으로변경
		MemberDTO dto = new MemberDTO();// 중간임시저장소
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPhone(phone);
		dto.setAddress(address);
		// System.out.println(dto);
		MemberDAO dao = new MemberDAO();
		int result = dao.insertMember(dto);
		System.out.println(result + " 명의 회원정보 입력 완료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
