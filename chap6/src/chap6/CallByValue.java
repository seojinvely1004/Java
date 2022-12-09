package chap6;

class C{
	void add(int i) {//매개변수 = 입력변수
		System.out.println(i++);
	}
}
public class CallByValue {

	public static void main(String[] args) {
		C c1 = new C();
		int j = 10;
		c1.add(j);//인수를 매개변수로 전달한다.
		System.out.println("main에서 add종료 후 j = " + j);
		//출력은 10, 메모리에 11로 저장 후 없어진다 , 복사본i는 11.j는 10이다.
		//main에서 메모리가 없어진 이후 돌아오기 때문.
		//매개변수 기본형 : stack에 실제값을복사하여 전달한 값을 저장
		//전달 이후 메소드(add) 내부 매개변수(i)값  변경하면 인수(j)의 변경은 없다.
	}
}
