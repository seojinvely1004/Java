package chap9;

public class ObjectClassTest {

	public static void main(String[] args) {
		//Object o1 = new Object();
		//Object o2 = new Object();
		MyObject o1 = new MyObject("myobject");
		MyObject o2 = new MyObject("my");
	//getClass.getName () + '@' + Integer.toHexString(hashCode())
	//패키지명.클래스명@16진수(해쉬코드-저장된주소.)
		//System.out.println(o1.toString());
		System.out.println(o1);
		//System.out.println(o2.toString());
		System.out.println(o2);
		System.out.println(o1 == o2);//false
		System.out.println(o1.equals(o2));//false
		
		
	}
}
class MyObject /*extends Object*/{
	String message;
	MyObject(String message){
		this.message = message;
	}
	//toString + equals + .... 자동포함 > 오버라이딩 전은 Object클래스 결과와 동일.
	//toString 오버라이딩
	@Override
	public String toString() {
		return this.message;
	}
}