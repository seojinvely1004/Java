package chap8;

public class CheckedTest {

	public static void main(String[] args) {
		//class.forName(args[0]);
		try {
			Class.forName(args[0]);
			System.out.println(args[0] + " -존재합니다.");
		}catch(ClassNotFoundException e) {
			System.out.println(args[0] + "-존재하지 않습니다.");
		}
	}

}
