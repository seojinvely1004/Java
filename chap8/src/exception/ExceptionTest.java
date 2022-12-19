package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		//2개 이상 명령행 매개변수 입력, 정수로 변경 가능하며 0이 아닌 값
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = i / j ;
		System.out.println("나누기결과 = " + k);
		System.out.println("main종료");

	}

}
