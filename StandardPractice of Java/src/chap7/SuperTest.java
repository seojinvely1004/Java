package chap7;
class A{
	int i;
	A(){
		i = 10;//생성자값을 10으로 초기화
		System.out.println("A생성자 호출");
	}
}
class B extends A{
	int j;
	B(){
		j = 20;//생성자값을 20으로 초기화
		System.out.println("B생성자 호출");
	}
}
public class SuperTest {

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		

	}

}
