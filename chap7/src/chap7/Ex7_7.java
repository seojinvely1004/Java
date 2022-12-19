package chap7;

public class Ex7_7 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe;
		//car.water(); 불가 
		fe2 = (FireEngine)car;
		fe2.water();
	}
}
class Car{
	String color;
	int door;
	
	void drive() {//운전하는 기능 drive()
		System.out.println("drive~!");
	}
	void stop() {//멈추는 기능 stop()
		System.out.println("stop~!");
	}
}
class FireEngine extends Car{//소방차
	void water() {//물을 뿌리는 기능 water()메서드
		System.out.println("water!!!!");
	}
}
