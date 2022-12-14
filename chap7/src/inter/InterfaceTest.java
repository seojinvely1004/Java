package inter;
class StudentWorker implements Student, Worker {
	String title = "조교";
	@Override
	public void work() {
		System.out.println("학교에서 일하다");	
	}

	@Override
	public void lunch() {
		System.out.println("학생식당이나 교직원식당에서 점심먹다");
	}

	@Override
	public void study() {
		System.out.println("도서관에서 공부하다");	
	}
	//아래와 같이 생성자 메서드 추가 가능하다.
	void team() {
		System.out.println("조교모임 참석하다");
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		//Worker w = new Worker();객체생성불가
		//Strudent s = new Strudent();객체생성불가
		
		StudentWorker sw = new StudentWorker();
		sw.study();
		sw.lunch();
		sw.work();
		sw.team();
		
		sw.title = "조교아님";
		//sw.dept = "국문학";인터페이스 상속받은 변수는 read only.변경불가
		//sw.score = 3.5;인터페이스 상속받은 변수는 read only.변경불가
	    System.out.println(sw.title);
	    System.out.println(sw.dept);//Worker인터페이스에서 상속받음
	    System.out.println(sw.score);//Student인터페이스에서상속받음
	    //System.out.println(Worker.dept);//Worker인터페이스에서 상속받음
	    //System.out.println(Student.score);//Student인터페이스에서상속받음
	    
	    Worker w = new StudentWorker();//부모 <== 자식 : 자동형변환시켜줌 
	    /*자동형변환 이후에 
	     * (X)w.non-overriding 메소드 => Worker인터페이스(X)
	     * w.overriding 메소드 => StudentWorker인터페이스 
	     * */
	    //w.study();불가
		w.lunch();
		w.work();
		//w.team();불가
		//Worker 인터페이스에서만 호출 가능하다. 
		
		Student s = new StudentWorker();
		s.lunch();
		s.study();
	}
}
