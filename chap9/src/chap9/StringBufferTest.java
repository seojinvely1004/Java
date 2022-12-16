package chap9;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("초기값");
		StringBuffer sb3 = new StringBuffer(100);
		System.out.println("sb1의 문자열 갯수 = " + sb1.length());
		System.out.println("sb2의 문자열 갯수 = " + sb2.length());
		System.out.println("sb3의 문자열 갯수 = " + sb3.length());
	}

}
