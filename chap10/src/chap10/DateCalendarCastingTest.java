package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateCalendarCastingTest {

	public static void main(String[] args) {
		//Calendar를 Date로 변환
		Calendar cal = Calendar.getInstance();
		Date calDate = cal.getTime();
		System.out.println(calDate);
		System.out.println(calDate.getClass().getName());

		//Date를 Calendar로 변환
		Date da = new Date();
		cal.setTime(da);
		System.out.println(cal);
	}

}
