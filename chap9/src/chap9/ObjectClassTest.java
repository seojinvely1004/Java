package chap9;

public class ObjectClassTest {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
	//getClass.getName () + '@' + Integer.toHexString(hashCode())
	//패키지명.클래스명@16진수(해쉬코드-저장된주소.)
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		System.out.println(o1 == o2);//false
		System.out.println(o1.equals(o2));//false
	}
}
