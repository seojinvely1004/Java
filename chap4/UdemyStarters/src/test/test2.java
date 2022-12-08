package test;

public class test2 {
	//연산자만 사용하여 출력하기.//초를 시간,분,초로 출력하기.
	public static void main(String[] args) {
		//초->시간 60*60으로 나눈다
		//분->초 60으로 나눈다
		//초->60으로 나눈 나머지
		int time = 10000;//초단위 시간.
		int hour = time/(60*60);
		int minute = time/60 - (hour*60);
		int second = time%60;
		//System.out.println(time + "초는" + hour + "시간" + minute + "분" + second + "초입니다.");
		System.out.printf("%d초는 %d시간 %d분 %d초입니다.", time, hour, minute, second);
	}

}
