package chap9;
public class WrapperTest {
	public static void main(String[] args) {
		/*int i = 10; 박싱문법사용하지않은 타입을 고수한 경우. 
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toOctalString(i));
		System.out.println(Integer.toHexString(i));*/
		
		//오토박싱(auto boxing), 오토언박싱(auto unboxing)
		Integer in = new Integer(10);//10정수.메서드이용
		int i = 10;//10정수.연산자 이용
		//int와 Integer의 성격은 유사하니 오른쪽엔 Integer객체를, 
		//선언을 Integer로하고 오른쪽에 값만 주는 것도 가능.구분을 없애겠다.
		//wrapper클래스와 기본형의 경계를 없애겠다.
		int i2 = new Integer(10);
		Integer in2 = 10;
	}
}
