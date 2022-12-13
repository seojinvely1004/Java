package chap7;
//import java.lang.Math;//Math non-static + static 메소드 사용 허락
import static java.lang.Math.*;//Math static 변수와 메소드 사용 허락
import static java.lang.Integer.*;
public class StaticImportTest {

	public static void main(String[] args) {
		int ran = (int)(Math.random()*100) + 1;//1~100난수발생
		System.out.println(ran);
		System.out.println(MAX_VALUE);
	}
}
