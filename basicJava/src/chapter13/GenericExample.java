package chapter13;

import java.util.ArrayList;

public class GenericExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("가"); // 0번째
		list.add("나"); // 1번째
		list.add("다"); // 2번째
		//만약
//		list.add(30); // 3번째
		//
		if(list.get(3) instanceof String) {
			String name1 = (String) list.get(3);
			System.out.println(name1);
		}
		//
		String name1 = (String) list.get(1);
		System.out.println(name1); //만약하면 에러
	}
}
