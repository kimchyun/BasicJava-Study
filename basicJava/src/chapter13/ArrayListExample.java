package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		//배열 - 과목변경 불가능 -> 추가 등 변경 x
		String[] subjects = {"Java","Database","Servlet/JSP","JDBC","iBatis"};
		//
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Servlet/JSP");
		list.add("JDBC");
		list.add(2,"Database");
		list.add("iBatis");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("갯수: " + list.size());
		System.out.println("2번째 과목: " + list.get(2));
		
		list.remove(2); //DB삭제
		list.remove(2); //JDBC삭제
		list.remove("iBatis"); //iBatis 삭제
		for (String string : list) {
			System.out.println(string);
		}
	}
}
