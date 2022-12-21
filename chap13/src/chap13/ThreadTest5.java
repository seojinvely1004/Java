package chap13;
class JoinThread extends Thread{
	int i = 1; 
	public void run() {//run이 수행됬냐안됬냐에 따라 i의값은 달라진다.
		i = 10;
		System.out.println("run메서드내부 = " + i);
	}
}
public class ThreadTest5 {
	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		//run 수행 
		t.start();//즉각적으로 run실행이 안될 수도 있다. 자체로 run실행하라는 뜻이 아닌 run이 가능한 상태로 만들라는 의미이다. 
		//자바 스레드 스케줄러에 따라 다르다 .>>t : 실행'가능'상태.main:실행상태//[run메서드내부 = 10]
		try {
			t.join();//t:실행상태 / main:일신중단상태(main은일단빠지고 t를 기다린다)
		}catch(Exception e) {
			e.printStackTrace();
		}		
		//System.out.println(t.i);//[1] _ run메서드수행 전
		System.out.println("main메소드 내부 = " + t.i);
		System.out.println("main 종료");
	}

}
