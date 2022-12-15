package chap8;
class Test2{
	void m1(int i) throws NumberFormatException  {
		if(i <= 0) {
			throw new NumberFormatException ();
		}
		//i 소수인지 판단
		int count = 0;
		for(int index = 1; index <= i; index++) {
			if(i % index == 0) {
				count++;
			}
		}//for end
		if(count == 2) {
			System.out.println(i + "소수이다.");
		}else {
			System.out.println(i + "소수 아니다.");
		}
	}
}
public class ThrowTest {
	public static void main(String[] args) {
		try {
		Test2 t2 = new Test2();	
		t2.m1(-13);
		t2.m1(13);
		}catch(NumberFormatException e) {
			System.out.println("음수");
		}
	}
}
