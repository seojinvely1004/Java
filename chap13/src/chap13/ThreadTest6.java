package chap13;
class Data{ 
	int value; 
	void saveValue(int value){//value에 값을 저장하는 메서드
		this.value += value;
		System.out.println(Thread.currentThread().getName() + "스레드가" + value + "전달 후 " +this.value);
	}
}
class DataThread1 extends Thread{
	Data data;
	int value;
	public DataThread1(String name, Data data, int value){//매개변수3개를 전달받을 수 있는 생성자 생성
		super(name);
		this.data = data;
		this.value = value;
	}
	public void run() {
		data.saveValue(value);//value가 4개의 서로다른 값 100,200,300,400을 전달해준다.
	}
}
class DataThread2 extends Thread{}
public class ThreadTest6 {
	public static void main(String[] args) {
		Data data = new Data();//공유 데이터를 사용하는 코드 영역-임계영역
		DataThread1 dt1 = new DataThread1("dt1",data, 100);
		DataThread1 dt2 = new DataThread1("dt2",data, 200);
		DataThread1 dt11 = new DataThread1("dt11",data, 300);
		DataThread1 dt22 = new DataThread1("dt22",data, 400);
		dt1.start();
		dt2.start();
		dt11.start();
		dt22.start();
	}

}
