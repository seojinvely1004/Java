package chap6;

class D{
	int add(int i, int j) {
		return i + j;
	}
	String add(String i, String j) {
		return i + j;
	}
	double add(double i, double j) {
		return i + j;
	}
}
public class OverloadTest {

	public static void main(String[] args) {
		D d1 = new D();
		String result1 = d1.add("spring", "framework");
		double result2 = d1.add(2.5, 1.1);
		int result3 = d1.add(1, 2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		//int는 double로 자동형변환이 되므로 가능.
		d1.add(3.14, 4);
		
		int dec = Integer.parseInt("100");
		//parseInt는 100이라는 String을 기본적으로 10진수로 변환해준다.
		//이것을 2진수로 변환해주고싶다면
		int bin = Integer.parseInt("100", 2);
		System.out.println(dec);//10진수 100
		System.out.println(bin);//2진수100 - 10진수 4

	}

}
