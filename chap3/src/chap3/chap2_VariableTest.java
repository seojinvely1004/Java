package chap3;

public class chap2_VariableTest {

	public static void main(String[] args) {
		//int 데이터타입 선언해보기(0~100사이의 점수라고하면 byte, short 데이터로도 선언 가능하다)
		int score = 99;
		System.out.println(score);
		//score = score + 100;
		//System.out.println(score);
		
		
		int score2 = 95, score3 = 60;
		System.out.println(score + score2 + score3 / 3);//215  연산자에 우선순위를 부여해줘야한다
		System.out.println((score + score2 + score3) / 3);//85
		//정수 평균 - 정수타입 데이터 연산 결과 정수
		int avg = (score + score2 + score3) / 3;
		System.out.println("정수평균=" + avg);
		//실수 평균
		double avgDouble = (score + score2 + score3) / 3.0;
		System.out.println("실수평균=" + avgDouble);
		System.out.println(Math.round(avgDouble));
		
		int radius = 5;
		final double pi = 3.14;
		double area = radius * radius * pi;
		radius = 10;
		
		System.out.println(10);//자바 int
		//System.out.println(100000000000000);//The literal 100000000000000 of type int is out of range 
		System.out.println(100000000000000L);//자바 Long
		System.out.println(true);//자바 int
		System.out.println('a');//자바 boolean literal
		
		
		char c1 = 'a';
		String s1 = "java 프로그램";
		String s2 = "a";
		
		//값 교환하기위해 temp변수 c 
		int a1 = 10;
		int b1 = 20; 
		int c = b1;
		b1 = a1;
		a1 = c;
		System.out.println("a1의 값 = "+a1+",b1의 값 = "+b1);
	
		System.out.printf("%d을 표현합니다.\n" , 10);
		System.out.printf("%f을 표현합니다.\n" , 10.9999);
		System.out.printf("%s을 표현합니다.\n" , "웅진");
		System.out.printf("%c을 표현합니다.\n" , '웅');
		
		String loc = "새싹 용산캠퍼스";
		String title = "클라우드 기반 웹서버 과정";
		int week = 3;
		System.out.printf("우리는" + loc+ "에서" + title +"을 수강합니다.\n" + "현재" + week + "주째 시작합니다.\n" );
		System.out.printf("우리는 %s 에서 %s을 수강합니다. \n현재 %d주째 시작합니다\n", loc, title, week);
		
		byte b = 127; //byte127 최대값
		//b = b + 1; 컴파일오류
		//byte + int ->int , int + int ->int
		int ii = b + 1; //128
		byte b2 = (byte)(b + 1);//컴파일 오류 발생X, 원래 128인값을 표현하기위해 변형
		System.out.println("int데이터 = " + ii + ",byte데이터" + b2);
		
		//자바스크립트 parseInt(9.8765) --> 9로 형변환함수
		
	}

}
