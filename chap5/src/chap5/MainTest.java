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
	}
}
