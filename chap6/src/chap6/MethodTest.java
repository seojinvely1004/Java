package chap6;

class B{
	int m1(){
		int local = 10;
		return local*10;
	}
	int m2(int param){//1.m2메서드에 param이라는 매개변수를 주었다.
		return param*10;
	}
	String m3(int param1, int param2){
		return param1 * param2 + "결과를 리턴합니다.";
	}
}
public class MethodTest {

	public static void main(String[] args) {
		B b1 = new B();
		int result1 = b1.m1();
		System.out.println(result1);//100//완성된 메서드를 main에서 호출해준다.//
		System.out.println(b1.m2(5));//50 //2.위처럼 호출해줘도 되고, 바로 불러와도 된다.
		System.out.println(b1.m2(50));//500
		System.out.println(b1.m3(6, 8));//48결과를 리턴합니다.
	}
}
