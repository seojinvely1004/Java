package chap4;

public class ScroeTest_Solving {
	/*조건문 if else
	avgInt 90이상 ~100이하 : grade "A등급"
	avgInt 80이상 ~ 90미만 : grade "B등급"
	avgInt 70이상 ~ 80미만 : grade "C등급"
	avgInt 60이상 ~ 70미만 : grade "D등급"
	avgInt 그외 : grade "낙제등급"
	*/

	public static void main(String[] args) {
		String name = "크롱";
		int kor =100, eng =60,mat = 75;
		int sum = kor + eng + mat; //총점
		double avg = (double)sum / 3;//실수평균
		int avgInt = sum / 3;//정수평균
		String grade = "";
		
		if (avgInt >=90 && avg <100) {
			grade = "A";
		}else if (avgInt >=80 && avgInt<90) {
			grade = "B";
		}else if (avgInt >=70 && avgInt<80) {
			grade = "C";
		}else if (avgInt >=60 && avgInt<70) {
			grade = "D";
		}else {
			grade = "낙제등급";
		}
		System.out.printf("%s 학생은 국어 = %d점, 영어 =%d점, 수학%d점입니다.\n"
				+ "총점은 %d이고 평균(실수)은 %.2f입니다.\n "
				+ "등급은 %s입니다.\n",name, kor, eng, mat, sum, avg, grade);
		//%.2f : 2자리실수까지보여라 
		//%3d : 3자리까지 보여라 
	}

}
