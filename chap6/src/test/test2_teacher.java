package test;

/*교육생 객체 표현 클래스
 * 1. 변수 - 이름.과정명.교육기관.교육비.부가금.환급비 
 * 2. 교육기관 = 새싹 모든 교육생 동일 공유  > static
 * 3. 단, 부가금 = 5000고정.수정불가능한 값. > 어디에 modified를 붙일지 생각
 * 4. 메소드 - 해야할일 무엇일까 생각. calc()
 * 4_1.과정명이 "java"이면 환급급 = 교육비의 20% + 부가금
 * 4_2. 과정명이 "jsp"이면 환급급 = 교육비의 15% + 부가금*2
 * 4_3. 과정명이 "spring"이면 환급급 = 교육비의 10% + 부가금
 * 4_4. 그외의 과정명은 환급급 = 0
 * 
 * 실행 : main 메소드 클래스 
 */
class Trainee {
	String name, subject;
	static String location = "새싹";//교육기관
	int	fee,returnFee;
	final int addFee = 5000;
	void calcReturnFee() {
		if(subject.equals("자바")){
			returnFee = (int)(fee * 0.2 + addFee);
		}else if(subject.toLowerCase().equals("jsp")) {
			returnFee = (int)(fee * 0.15 + addFee*2);			
		}else if(subject.toUpperCase().equals("SPRING")) {
			returnFee = (int)(fee * 0.1 + addFee);			
		}else {
			System.out.println("과정명은 없습니다.");
			//returnFee=0;
		}
		System.out.printf(
				"이름 : %s\n과정명 : %s\n교육비 : %d\n교육기관 : %s\n부가금 : %d\n환급비 : %d",
				name, subject, fee, Trainee.location, addFee, returnFee );
	}
}
public class test2_teacher {

	public static void main(String[] args) {
		/*교육생 a1 = new 교육생()*;//교육생 객체 만들 것.
		 * 이름,과정명,교육비 (3개만) 명령행 매개변수 입력받을 수 있도록 할당 할 것
		 * 교육생 환급비 계산 메소드 호출> 리턴 결과 아래와 같이 화면에 출력할 것
		 * 이름 : xxx
		 * 과정명 : xxx
		 * 교육비 : xxx
		 * 교육기관 : 새싹 (stastic)
		 * 부가금:5000
		 * 환급비 : xxx 
		 */
				
		Trainee t1 = new Trainee();
		
		t1.name = args[0];
		t1.subject = args[1];
		//t1.fee = args[2];
		t1.fee = Integer.parseInt(args[2]);
		t1.calcReturnFee();
	}

}
