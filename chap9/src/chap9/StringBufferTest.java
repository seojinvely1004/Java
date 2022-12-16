package chap9;
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("초기값");
		StringBuffer sb3 = new StringBuffer(100);
		System.out.println("sb1의 문자열 갯수 = " + sb1.length());
		System.out.println("sb2의 문자열 갯수 = " + sb2.length());
		System.out.println("sb3의 문자열 갯수 = " + sb3.length());
		System.out.println("sb1의 용량 = " + sb1.capacity());//16 : 최초만들어졌을 때 저장할 수 있는 buffer의크기는 16이다.
		System.out.println("sb1의 용량 = " + sb2.capacity());//3 + 16
		System.out.println("sb1의 용량 = " + sb3.capacity());//100
		sb2.append("추가한 값");
		sb2.append("추가한 값");
		sb2.append("추가한 값");
		sb2.append("추가한 값");
		sb2.append("추가한 값");
		System.out.println("문자열 추가 후 sb2의 용량 = " + sb2.capacity());
		
		sb2.delete(0, 10);//0~9 10개의 문자를 삭제한다.
		System.out.println("sb2의삭제한 문자열 개수 = " + sb2.length());
		
		//StringBuffer는 + 연산자 X > append()메서드사용한다.
		sb2.append("추가한 값");
		System.out.println("sb2의문자열갯수 = " + sb2.length());	
	}
}
