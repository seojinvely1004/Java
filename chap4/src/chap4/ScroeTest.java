package chap4;

import java.util.Scanner;
/*조건문 if else와 switch case로 
avgInt 90이상 ~100이하 : grade "A등급"
avgInt 80이상 ~ 90미만 : grade "B등급"
avgInt 70이상 ~ 80미만 : grade "C등급"
avgInt 60이상 ~ 70미만 : grade "D등급"
avgInt 그외 : grade "낙제등급"
*/

public class ScroeTest {

	public static void main(String[] args) {
		String name = "";
		int kor =0;
		int eng =0;
		int mat = 0;
		int sum = 0; //총점
		double avg = 0.0;//실수평균
		int avgInt = 0;//정수평균
		String grade;
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("name 학생은 국어 = kor점, 영어 = eng점, 수학mat점입니다.\n"
				+ "총점은 sum이고 평균(실수)은 avg입니다.\n "
				+ "등급은 grade입니다.\n",kor, eng, mat, sum, avg);
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		mat = scanner.nextInt();
		
		sum = (kor + eng + mat);
		avgInt = sum / 3;
		
		if (avgInt >=90 && avg <100) {
			grade = "A";
		}else if (avgInt >=80 && avgInt<90) {
			grade = "B";
		}else if (avgInt >=70 && avgInt<80) {
			grade = "C";
		}else if (avgInt >=60 && avgInt<70) {
			grade = "D";
		}else {
			System.out.println("낙제등급입니다.");
		}

	}

}
