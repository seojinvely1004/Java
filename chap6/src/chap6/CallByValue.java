package chap6;
class Data{
	int k = 10;
}
class C{
	void add(int i) {//매개변수 = 입력변수 (기본형)
		System.out.println(i++);
	}
	void addData(Data d) {//매개변수 (참조형)
		System.out.println(d.k++);
		
	}
}
public class CallByValue {

	public static void main(String[] args) {
		C c1 = new C();
		//2.참조형변수 전달 테스트 코드
		Data main_d = new Data();
		c1.addData(main_d);
		System.out.println("main에서 addData종료 후 main_d = " + main_d.k);//11
		/*매개변수 참조형 : stack에 실제값이 아닌! 주소값을 전달한다
		 * 인수(main_d)를 매개변수(d)로 "주소"를 복사하여 전달하면 
		 * 인수와 매개변수는 동일 객체를 참조한다.
		 * 따라서 인수참조객체 내부 변수값(main_d.k)이 변경되면 매개변수참조객체 내부 변수값(d.k)도 변경된다.
		 */
		
		//1.기본형변수 전달 테스트 코드 
		/*int j = 10;
		c1.add(j);//인수를 매개변수로 전달한다.
		System.out.println("main에서 add종료 후 j = " + j);//10
		//출력은 10, 메모리에 11로 저장 후 없어진다 , 복사본i는 11.j는 10이다.
		//main에서 메모리가 없어진 이후 돌아오기 때문.
		//매개변수 기본형 : stack에 실제값을복사하여 전달한 값을 저장
		//전달 이후 메소드(add) 내부 매개변수(i)값  변경하면 인수(j)의 변경은 없다.*/
	}
}
