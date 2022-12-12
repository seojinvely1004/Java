package chap5;

public class MainTest {

	public static void main(String[] args) {
		System.out.println("입력한 변수의 갯수 = " + args.length);
		System.out.println("입력한 내용은 다음과 같습니다.");
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);//반복될 때마다의 데이터를 출력.
		}
		//입력 매개변수 갯수 + 1 의크기배열 userarray을 만들겠다 
		String userarray[] = new String[args.length + 1];
		for(int i = 0; i < args.length; i++) {
			userarray[i] = args[i];//입력변수들 복사 ([0]과 [1]
			System.out.println(userarray[i]);
		}
		System.out.println("==================>");
		//userarray[2] = "내가 추가한 문자열";
		//args엔 추가할 수 없어 userarray를 만들어 추가해준다.
		userarray[args.length] = "내가 추가한 문자열";
		for(int i = 0; i < userarray.length; i++) {
			System.out.println(userarray[i]);
		}
		//String 타입 입력 덧셈 100 45를 run configuration의 argument에 입력.
		System.out.println(args[0] + args[1]);//10045
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));//145
		
		//
		String s1 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		String s2 = "java";
		s2 = "jsp";
		//명령행매개변수, 문자열 1번 메모리 생성되면 고정이다.
		
		if(s1 == s2) {//true
			System.out.println("s1 == s2 결과 같다");
		}
		if(s3 == s4) {//false
			System.out.println("s3 == s4 결과 같다");
		}
		if(s1.equals(s2)) {//true
			System.out.println("s1.equals(s2) 결과 같다");
		}
		if(s3.equals(s4)) {//true
			System.out.println("s3.equals(s4)  결과 같다");
		}
	}

	
}

