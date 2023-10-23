package chapter05;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		//오늘의 요일을 알아내는 방법
		//1. Date객체
		//2. Calendar객체
		//3. LocalDate객체
		Calendar cal = Calendar.getInstance();//캘린더 객체 가져오기
		int week = cal.get(Calendar.DAY_OF_WEEK);//일(1)~토(7)까지의 숫자리턴
		//System.out.println(week); 오늘은 금요일이므로 6출력
		
		Week today = null;
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일: " + today.korName);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부합니다.");
		}
	}
 }
