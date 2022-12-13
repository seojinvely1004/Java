package chap7;

class Employee{//사원
	String title = "사원";
	int id;
	String name;
	String dept;
	double salary;
	void calcSalary(int salary) {
		this.salary = salary*2;
	}
/*default상태*/	void printAll() {
		System.out.printf("사번 = %d 이름 = %s 부서명 = %s 급여 = %f\n", id, name, dept, salary);
	}
}

class Manager extends Employee{//관리직
	String title = "관리직";
	void test() {//상속을 받은 것도 아니며, 오버라이딩도 아니며, 현재 추가한 메서드이다.
		String title = "test메소드 내부";
		System.out.println(title);//지역변수
		System.out.println(this.title);//관리직. Manager클래스의 멤버변수
		System.out.println(super.title);//사원 . 상속받은 title
	}
	String job;
	//calcSalary, printAll 메소드 Employee에서 정의한 대로 상속받아 사용할 수 있다.
	//메서드의 내용을 수정하고 싶다 - 메소드 내용 재정의의하여 사용 가능함 : overriding
	//printAll에 +job ====> overriding
	
	@Override //'@'자바컴파일러에게 알려주는 주석문
/*private는가능하다*/void printAll() {
		System.out.printf("사번 = %d 이름 = %s 부서명 = %s 급여 = %.2f 관리직종 = %s\n", id, name, dept, salary, job);
		
	}
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;//상속
		m.name = "크롱";//상속
		m.dept = "영업부";//상속
		m.job = "영업관리";//자식
		m.calcSalary(50000);//상속
		m.printAll();//상속받아서 메소드 재정의 = overriding
		/*System.out.printf
		("사번 =%d 이름 =%s 부서명 =%s 관리직종=%s\n",
				m.id, m.name, m.dept, m.job);*/
		m.test();

	}

}
