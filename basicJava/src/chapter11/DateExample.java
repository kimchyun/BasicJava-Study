package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		//날짜를 2024-04-05 수요일 나오게
		//미리 날짜형식을 지정해서 사용 --SimpleDateFormat
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(dateFormat.format(date));
		//날짜를 Singleton 형식으로제공 -- 잘안씀
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		System.out.printf("");
		//이걸사용!!! JDK 1.8부터 사용가능 //2023-04-05 (운영체제에 따라 바뀜) //2023년 04월 05일 수요일
		System.out.println(LocalDate.now());
		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일")));
	}
}
