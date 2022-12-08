package test;

public class test1 {
	//연산자만 사용하여 출력하기.
	public static void main(String[] args) {
		int number = 544;// su 3자리 정수
		int digit = number%1000/100;
		System.out.println(number +"의 백의자리 숫자는" + digit + "입니다.");
		//System.out.println(su + "의 백자리 숫자는 " + ??? + "입니다.");
		//544면 5가 나오도록, 123이면 1이 나오도록

	}

}