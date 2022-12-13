package chap7;

abstract class Shape{
	abstract void area();//면적
	abstract void circum();//둘레
	
	void print() {//상속받은 자식클래스가 반드시 오버라이딩을 할 필요는 없음
		System.out.println("면적과 둘레 출력 기능");
	}
}
class Rectangle extends Shape{
	int width, height;
	public Rectangle(String width, String height) {
		this.width = Integer.parseInt(width);
		this.height = Integer.parseInt(height);	
	}

	@Override
	void area() {
		System.out.println("가로 = " + width + ", 세로 = " + height + "인 사각혁의 면적 = " + width*height);
	}
	@Override
	void circum() {
		System.out.println("가로 = " + width + ", 세로 = " + height + "인 사각혁의 둘레 = " + 2*(width+height));
		
	}
}
class Circle extends Shape{
	int radius;
	static final double pi = 3.14; //final 변경불가 , static 공유한다  
	Circle(String radius) {
		this.radius = Integer.parseInt(radius);
		
	}

	@Override
	void area() {
		System.out.println("반지름 = " + radius +"인 원의 면적 = " + radius*radius*3.14);
		//super.print( radius * radius * 3.14);		
	}
	@Override
	void circum() {
		System.out.println("반지름 = " + radius +"인 원의 둘레 = " + 2 * radius *3.14);
		//super.print( 2 * radius * 3.14);
	}
}
public class ShapeTest {
	public static void main(String[] args) {
		//Shape s = new Shape();//shape은 인스턴스,객체선언불가능하다. abstract이므로 > 상속받아야한다.
		//명령행 매개변수 입력
		//rect, 6, 8 -3개입력받고 첫번째 "rect"문자열이면 사각형의 면적,둘레 계산
		//Rectangle객체생성
		//Rectangle rec = new Rectangle();
		//면적구하고싶으면 - area() 호출 하여 두,세번째 가로.세로면적 출력
		//둘레-..
		
		//cir, 5 - 2개입력받고 첫번째 "cir"이면 원의 면적, 둘레 계산
		//Circle cir = new Circle();
		//Circle객체생성
		//두번째 반지름, 면적 둘레
		
		//"면적"과 "둘레"구할 수 있어야 한다. (구현필수)
		Shape s = null;
		
		if(args.length == 3 && args[0].equals("rect")) {
			s = new Rectangle(args[1], args[2]);
		}else if(args.length == 2 && args[0].equals("cir")){
			s = new Circle(args[1]);
		
		}else {
			System.out.println("지원되지 않는 도형입니다.");
		}
		s.area();
		s.circum();
	}
}
