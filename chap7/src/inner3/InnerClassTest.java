package inner3;

class Outer {
	void test() {
		class LocalInner{//지역변수 유사 취급
			int j = 20;
			void mi() {
				System.out.println(j);
			}
		}
		new LocalInner().mi();
	}//test
}//outer
public class InnerClassTest {

	public static void main(String[] args) {
		Outer o = new Outer(); 	
		o.test();
	}

}
