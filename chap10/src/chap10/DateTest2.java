package chap10;

import java.util.Calendar;
import java.util.Date;

public class DateTest2 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now/*.toString()*/);
		System.out.println(now.getYear());//deprecated메서드 , 사용자제권고
		
		//Calendar()는 인스턴스 생성 불가. - 추상클래스 
		//구현 자식클래스들을 제공한다 , 한국.
		//static메서드 - Calendar 객체 생성 리턴 메서드 
		//locale (os) 설정 맞는 시간,날짜,생성 클래스 객체를 리턴.
		java.util.Calendar cal = Calendar.getInstance();
		//cal.set(2023, 0, 11);//2023.1.11
		cal.set(Calendar.YEAR,2024);//2024.12.16
		cal.add(Calendar.MONTH, 1);//2025.1.16
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);//2022
		int month = cal.get(Calendar.MONTH);//11
		System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int date = cal.get(Calendar.DAY_OF_WEEK);
		final String weekdays[] = {"","일","월","화","수","목","금","토"};
		
		//1-일요일 2-월요일 3-화-4-수 5-목 6-금 7-토
		//System.out.printf("현재 년도 = %d, 월 = %d, 일 = %d, 시간 = %d, 분 = %d, 초 = %d, 요일 = %d\n", year, month, day, hour, minute, second, date);
		System.out.printf("현재 년도 = %d, 월 = %d, 일 = %d, 시간 = %d, 분 = %d, 초 = %d, 요일 = %d\n", year, month, day, hour, minute, second, weekdays[date]);
		
		
		
		
	}

}

