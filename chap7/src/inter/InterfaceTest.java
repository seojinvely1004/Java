package inter;
class StudentWorker implements Student, Worker {

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
	}
}