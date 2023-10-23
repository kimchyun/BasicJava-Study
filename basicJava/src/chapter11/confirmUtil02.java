package chapter11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class confirmUtil02 {
	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh시 mm분")));
	}
}
