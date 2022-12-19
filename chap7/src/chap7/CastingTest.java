package chap7;

class Parent {
	int su = 10;
	void print() {
		System.out.println(su);//10
	}
}
class Child1 extends Parent {
	//int su = 10; Child1은 su 2개값 가짐 (상속받은것, 자신 것)
	int su = 20;
	void print() {
		System.out.println(su);//20, Parent를 overriding 한 메서드 (재정의했다)
	}
}
public class CastingTest {

	public static void main(String[] args) {

		Parent p1 = new Parent();//객체생성 형변환없
		System.out.println(p1.su);//10
		p1.print();//10
		
		Child1 c1 = new Child1();//객체생성 형변환없
		System.out.println(c1.su);//20
		c1.print();//20
		
		Parent p2 = new Child1();//객체생성 - 형변환 >자식은 언제든 부모가 될 수 있다>부모를 가리켜라.
		System.out.println(p2.su);//10
		p2.print();//20 
	}

}
