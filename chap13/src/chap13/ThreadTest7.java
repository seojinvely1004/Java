package chap13;
class Buffer{//저장
	int value;
}
class Producer extends Thread{//프로듀싱 동작(저장)
	
}
class Consumer extends Thread{//Buffer값을 읽는 Consumer가 동작(조회)
	
}
public class ThreadTest7 {

	public static void main(String[] args) {
		Buffer buf = new Buffer();
		Producer p = new Producer(buf);
		Consumer c = new Consumer(buf);
		p.start();//저장
		c.start();//조회

	}

}
