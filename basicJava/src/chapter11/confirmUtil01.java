package chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class confirmUtil01 {
	public static void main(String[] args) {
	Date date = new Date();
	System.out.println(date);
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
	System.out.println(simpleDateFormat.format(date));
	}
}
