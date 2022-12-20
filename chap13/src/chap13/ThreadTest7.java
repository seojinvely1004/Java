package chap13;
class Buffer{//저장
	int value;
	synchronized int getValue() {
		System.out.println("조회 : "+ value);
		return value;
	}
	synchronized void setValue(int value) {
		this.value = value;
		System.out.println("저장 : "+ value);
	}
}
class Producer extends Thread{//프로듀싱 동작(저장)
	Buffer buf;
	Producer(Buffer buf){//생성자
		this.buf = buf;
	}
	public void run(){ //스레드를 상속받았으니 run()메서드는 기본
		for(int i = 1; i <= 10; i++) {
			buf.setValue(i);
		}
	}
}
class Consumer extends Thread{//Buffer값을 읽는 Consumer가 동작(조회)
	Buffer buf;
	Consumer(Buffer buf){//생성자
		this.buf = buf;
	}
	public void run() {
		for(int i = 1; i <= 10; i++) {
			buf.getValue();
		}	
	}
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
