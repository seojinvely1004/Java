package chap13;
class MyThread extends Thread{
	@Override
	public void run() {
		for(int i =1; i<=50; i++) {
			System.out.print("mt/");
		}
	}
	
}
class Mythread2 implements Runnable{
	public void run() {
		for(int i =0; i<=50; i++) {
			System.out.print("t2/");
		}
	}
}
public class ThreadTest1 {
	public static void main(String[] args) { //main스레드 (자바언어자동)
		MyThread mt = new MyThread();
		Mythread2 mt2 = new Mythread2();//Runnable은 start없어서 thread객체로 
		Thread t2 = new Thread(mt2);
		//우선순위 변경
		
		mt.setPriority(10); //windows는 크게 차이는 없고, 시간분할이 더 크다
		t2.setPriority(1); // 
		
		
		System.out.println("mt 우선순위 = "+ mt.getPriority());
		System.out.println("t2 우선순위 = "+ t2.getPriority());
		System.out.println("메인 우선순위 = "+ Thread.currentThread().getPriority());
		
		
		mt.start(); 
		//mt.run(); //run호출시에는 메인이 맨마지막에 출력됨
		//t2.run(); 
		t2.start();
		//System.out.println("메인종료");	
	}	
}