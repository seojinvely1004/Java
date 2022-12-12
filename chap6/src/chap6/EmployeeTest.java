package chap6;
//기본 : 자바 클래스명 = 자바파일명 
//아닌 경우도 가능하지만 접근제어자 public은 키워드 1개 클래스에만 선언해야한다. main메소드
//회사원class , 5개의 객.체.변.수 > "클래스" 정의.
class Employee{
	int id;//클래스의 '객체변수'
	String name;
	String title;//직급
	String dept;//부서
	double salary;
	void printInform(String name) {
		int id = 300;//메소드 내의 '지역변수'
		System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
			this.id, this.name, title, dept, salary);
		
	}
}
public class EmployeeTest {
//자바 어플리케이션 클래스 (특정기능부여) - "대장"main
	public static void main(String[] args) {
		//배열 Employee객체만 10개 
		Employee arr[] = new Employee[10];
		
		//Employee클래스의 e1객체 1개 생성
		Employee e1 = new Employee();//Employee의 복사본 , e1:참조형변수
		e1.id = 100;
		e1.name = "이사원";
		e1.title = "사원";
		e1.dept = "it개발부";
		e1.salary = 10000;
		//System.out.println(e1.name);//e1:참조형변수 , name:e1의속성
		/*System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.\n",
				e1.id, e1.name, e1.title, e1.dept, e1.salary);*/
		e1.printInform("1");
		//Employee클래스의 e2객체 1개 생성
		Employee e2 = new Employee();
		e2.id = 200;
		e2.name = "박대리";
		e2.title = "대리";
		e2.dept = "인재개발부";
		e2.salary = 15000;
		/*System.out.printf("사번 %d 이름 %s 직급 %s 부서명 %s 급여 %.2f입니다.",
				e2.id, e2.name, e2.title, e2.dept, e2.salary);*/
		e2.printInform("2");
	}
}
