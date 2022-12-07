package chap3;
//소스파일(수동)-컴파일(자동)-실행(수동)-main메소드 내부 문장
//java application program
//남궁성_자바의정석 1. 자바특징 /eclipse + jdk 환경설정
//2.변수 (46p)3.연산자 4. 조건문,반복.

public class chap2_Hello {

	public static void main(String[] args) {
		System.out.println("Hello Java");
		System.out.println("두번째줄입니다" + "--두번째줄입니다.");
		//연산자 출력 기능2가지 "자주"사용
		/*1.문자열+문자열 or 문자열+다른타입 > 문자열 결합
		 * 2. 정수,실수 + 정수,실수 >덧셈
		 * 3.왼쪽부터 연산
		 * 4.우선순위()
		 * */
		System.out.println("세번째줄입니다" + (100+200));
		

	}

}
