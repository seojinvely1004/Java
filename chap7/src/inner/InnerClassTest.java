package inner;

class Outer {
	int i = 10;//Outer 클래스의 멤버변수
	void mo() {
		System.out.println(i);//외부클래스 메서드는 내부클래스 요소 접근 불가
	}
	class Inner{
		int j = 20;//Inner 클래스의 멤버변수.와 유사 취급
		void mi() {
			System.out.println(i - j);//내부클래스 메서드는 외부클래스 요소 접근 가능
		}
	}
}
public class InnerClassTest {

	public static void main(String[] args) {
		//Inner i = new Inner();불가. >outer를먼저부르고 i를불러야한다.
		
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner(); 
		//Outer.Inner inner = new Outer().new Inner();
		System.out.println(o.i);
		System.out.println(inner.j);
	}

}
