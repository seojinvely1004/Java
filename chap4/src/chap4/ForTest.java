package chap4;

public class ForTest {

	public static void main(String[] args) {
		char star = '*';

		int count = (int)(Math.random() * 20) + 1;
		//count만큼 한줄에 *를 반복 출력 1~20난수
		int lines = (int)(Math.random() * 10) + 1;
		//출력할 줄 갯수 1~0난수
		System.out.println(lines + "줄에" + count + "만큼 출력합니다.");
		for(int j = 1; j <= lines; j++) {
			for(int i = 1; i <=count; i++) {
				System.out.print(star);
			}//inner for end
			System.out.println("\n");//inner for문 끝난 후 줄을 바꿔 lines가 for문되도록
		}//outer for end
	}

}
