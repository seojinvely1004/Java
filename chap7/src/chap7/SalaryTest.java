package chap7;

class Employee {

	int id;
	String name;
	int baseSalary;//본봉
	int generalFee;//사원수당
	int totalSalary;//총급여 > private쓰면 상속안되므로 쓰면안된다.
	//전달받은 매개변수를 초기화
	//Employee(){};//기본생성자 자동정의 - 추가시점 자동 삭제/지만 하위클래스들이 사용하도록 정의한다.
	Employee(int id, String name, int baseSalary, int generalFee){
		this.id = id;
		this.name = name;
		this.baseSalary = baseSalary;
		this.generalFee = generalFee;
	}
	void calcSalary() {
		totalSalary = baseSalary + generalFee;
	}
}
class Manager extends Employee{//총급여 = 본봉 + 일반수당 +"간부수당"
	int manFee;//간부수당
	public Manager(int id, String name, int baseSalary, int generalFee, int manFee) {
		super(id, name, baseSalary, generalFee);
		//source - generate constructor ~ 이용하기
	}
	//오버라이딩 (Employee총급여 + manFee > 필요에 따라 수정하여사용)
	@Override//source - implements 이용하기 
	void calcSalary() {
		//totalSalary = baseSalary + generalFee + manFee;
		super.calcSalary();
		totalSalary += manFee;
	}

}
class Engineer extends Employee{//총급여 = 본봉 + 일반수당+자격수당+기술수당
	int techFee, certiFee;//기술수당, 자격수당

	public Engineer(int id, String name, int baseSalary, int generalFee, int techFee, int certiFee) {
		super(id, name, baseSalary, generalFee);
		this.techFee = techFee;
		this.certiFee = certiFee;
		//source - generate constructor ~ 이용하기
	}

	@Override
	void calcSalary() {
		super.calcSalary();
		totalSalary += techFee + certiFee;
	}
}
class Secretary extends Employee{//총급여 = 본봉 + 일반수당+비서수당
	int secFee;//비서수당

	public Secretary(int id, String name, int baseSalary, int generalFee, int secFee) {
		super(id, name, baseSalary, generalFee);
		this.secFee = secFee;
		//source - generate constructor ~ 이용하기
	}

	@Override
	void calcSalary() {
		super.calcSalary();
		totalSalary += secFee;
	}
	
	
}
////===================================================////
public class SalaryTest {

	public static void main(String[] args) {
		Employee e [] = new Employee[4];
		// 1.상속 2.생성자(타입 순서 갯수....)
		e[0] = new Employee(1000,"이사원",10000,5000);
		e[1] = new Manager(2000,"김간부",20000,10000,10000);
		e[2] = new Engineer(3000,"박기술",15000,7500,5000,5000);
		e[3] = new Secretary(4000,"최비서",15000,7000,10000);
		
		System.out.println("사번 : 이름 : 본봉 : 총급여");
		for(int i = 0; i < e.length; i++) {
			e[i].calcSalary();//4개객체오버라이딩.형변환 이후 원래 객체 내부 메서드 호출
			System.out.println
			(e[i].id + ":" + e[i].name + ":" + e[i].baseSalary + ":" + e[i].totalSalary);
			if(e[i] instanceof Engineer) {//명시적현변환 (Engineer)로해줘야한다. techFee와 certiFee는 E에만있음.
				System.out.println("기술직사원의 경우 : " + ((Engineer)e[i]).techFee + "," + ((Engineer)e[i]).certiFee);
			}
		}
		
		/* 배열 내의 각 객체의
		 급여계산메소드 호출하고
		사번, 이름, 총급여 출력
		 단, 기술직 사원은 기술수당, 자격수당도 출력
		사번:이름:본봉:총급여
		1000:이사원:10000:xxxxx
		2000:김간부:20000:xxxxx
		3000:박기술:15000:xxxxx
		기술직사원의 경우 : 기술수당 자격수당
		4000:최*/

	}

}
