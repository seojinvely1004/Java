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
		System.out.println("폰 번호 입력 : ");
		String phone = key.next();
		System.out.println("주소 입력 : ");
		String address = key.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
