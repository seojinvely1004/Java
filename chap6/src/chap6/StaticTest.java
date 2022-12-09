package chap6;
class Person{
	String name;
	int age;
	static String nation = "한국";//person객체 공유. 1개 메모리 할당. 모든 객체 공통값
	//static : 멤버변수 앞에 붙혀 모든 곳에서 공유 가능하도록 해줌.
	//멤버변수 중 static이 붙은 것은 클래스 변수, 붙지 않은 것은 인스턴스 변수이다.
}
//run - 오류검사/static할당/main/객체생성
public class StaticTest {

	public static void main(String[] args) {
		System.out.println("모든 사람들의 국적은 " + Person.nation + "입니다.");
	
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 22;
		//p1.nation = "한국";
		System.out.println(p1.name + " : " + p1.age +" : "+ Person.nation);
		Person p2 = new Person();
		p2.name= "이철수";
		p2.age = 30;
		//p2.nation = "한국";
		System.out.println(p2.name + " : " + p2.age +" : "+ p2.nation);

	}

}
