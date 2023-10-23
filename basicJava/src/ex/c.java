package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("신용길", 95);
		map.put("홍길동", 95);
		System.out.println(map.size());
		System.out.println("홍길동의 점수: " + map.get("홍길동"));
		
		//map.put(new Student(1, "홍길동"), 95);
	}
}
	
