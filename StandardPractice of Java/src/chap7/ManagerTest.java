package chap7;

class Employee{//사원
	int id;
	String name;
	String dept;
	double salary;
}
class Manager extends Employee{//관리직
	String job;
	
}
public class ManagerTest {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.id = 100;//상속
		m.name = "크롱";//상속
		m.dept = "영업부";//상속
		m.job = "영업관리";//자식
		System.out.printf
		("사번 =%d 이름 =%s 부서명 =%s 관리직종=%s\n",
				m.id, m.name, m.dept, m.job);

	}

}
