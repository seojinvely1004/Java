package chap6;

class A{
	int i;//클래스 내부 변수 = 전역 변수,member variable
	public void test() {
		int j = 20;//test()의 지역변수, local variable
		System.out.println(j);
	}
}
public class MemberLocalTest {
	public static void main(String[] args) {
		A a1 = new A(); //사용자정의 A타입의 a1객체생성
		a1.i =10;//10
		System.out.println(a1.i);
		a1.test();//20
		//a1.j = 200; ERROR
	}

}
