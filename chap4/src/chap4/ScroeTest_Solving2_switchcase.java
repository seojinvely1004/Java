package chap4;
public class ScroeTest_Solving2_switchcase {
	public static void main(String[] args) {
		String name = "크롱";
		int kor = 90, eng = 80, mat = 0;
		int sum = kor + eng + mat; //총점
		double avg = (double)sum / 3;//실수평균
		int avgInt = sum / 3;//정수평균
		String grade = "";
		
		int avgInt2 = avgInt / 10;//9,8,7,6,5...
		switch(avgInt2) {
		case 10 : grade="A";
		break;
		case 9 : grade="A";
		break;
		case 8 : grade="B";
		break;
		case 7 : grade="C";
		break;
		case 6 : grade="D";
		break;
		default : grade = "낙제등급";
		}
		System.out.printf("%s 학생은 국어 = %d점, 영어 =%d점, 수학%d점입니다.\n"
				+ "총점은 %d이고 평균(실수)은 %.2f입니다.\n "
				+ "등급은 %s입니다.\n",name, kor, eng, mat, sum, avg, grade);
		//%.2f : 2자리실수까지보여라 
		//%3d : 3자리까지 보여라 
	}

}
