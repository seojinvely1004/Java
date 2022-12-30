package member_crud;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		while (true) {
			System.out.println("=== 회원관리 프로그램 ===");
			System.out.println("1.회원정보입력");
			System.out.println("2.회원정보수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.전체회원조회");
			System.out.println("5.종료");
			System.out.print("번호 입력 : ");
			Scanner key = new Scanner(System.in);
			int menu = key.nextInt();
			if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else if(menu == 1) {
				new MemberInsertView().input();
			}
		} // while
	}// main

}// class
