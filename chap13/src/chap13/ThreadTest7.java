package chap13;
//wait()통신하는것. notify()멈췄던 것을 동작해.
class Buffer{//저장
	int value;
	boolean available = false;
	//available false value 저장가능상태
	synchronized int getValue() {
		while(available == false) {//getValue시엔 available이 무조건 true여야한다. false면 기다려라
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("조회 : "+ value);
		available = false;//읽어왔으므로 false로만들어줌
		notify();//<<<<<==========================
		return value;
	}
	synchronized void setValue(int value) {
		while(available == true) {
			try {
				wait();//읽을 것이 없는데 읽을거면 wait해라.
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		//available == true
		this.value = value;
		available = true;
		System.out.println("저장 : "+ value);
		notify();//<<<<<==========================
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
