package member_crud;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		while(true) {
		System.out.println("=== 회원관리 프로그램 ===");
		System.out.println("1.회원정보입력");//MemberInsertView input()-->MemberDAO insertMember()
		System.out.println("2.회원정보수정");
		System.out.println("3.회원탈퇴");
		System.out.println("4.회원정보조회");//id, pw 입력하면 이름 - 주소 조회- 1개
		System.out.println("5.전체회원조회");// 입력x --> 모든 회원 id,이름 조회- 여러개
		System.out.println("6.종료");
		System.out.print("번호 입력 : ");
		Scanner key = new Scanner(System.in);
		int menu = key.nextInt();
		if(menu == 6) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		else if(menu == 1) {
			new MemberInsertView().input(); 
		}
		else if(menu == 2) {
			new MemberUpdateView().input();
		}
		else if(menu == 3) {
			new MemberDeleteView().input();
		}
		else if(menu == 4) {
			new OneSelectView().input();
		}
		else if(menu == 5) {
			new TotalSelectView().input();
		}
		}//while
	}//main

}//class
