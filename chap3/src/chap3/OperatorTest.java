package chap3;

public class OperatorTest {

	public static void main(String[] args) {
		int avgInt = 10 / 3;//3
		double avgDouble = 10.0 / 3.0; //3.3333333
		double avgDouble2 = 10.0 / (double)3;//3.33333

		System.out.println(avgInt);
		System.out.println(avgDouble);
		System.out.println(avgDouble2);

		//연산자
		int a = 10;
		int b = 20;
		//a = a + b - 1 * 3 / 5;
		//연산 우선순위 () : * / : +- : =
		a += b; //a = a + b;와 같다. 

	}

}
