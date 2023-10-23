package chapter13;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.LinkedList;
//import java.util.List;
import java.util.Set;
//import java.util.TreeSet;
//import java.util.Vector;

public class HashSetExample {
	public static void main(String[] args) {
		/*List<String> list = new ArrayList<>();
		//List<String> list = Arrays.asList(null);
		list = new Vector<>();
		list = new LinkedList<>();*/
		
		Set<String> set = new HashSet<>();// 타입추론으로 생략
		//set = new LinkedHashSet<>();
		//set = new TreeSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("iBatis");
		set.add("Database");
		set.add("SpringMVC");
		set.add("Java");
		set.add("python");
		// jdk 1.5미만에서 많이사용 -> Iterator 반복자
		Iterator<String> iterator = set.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
		
		//jdk 1.5부터 foreach (a.k.a advanced for loop)
		for (String string1 : set) {
				System.out.println(string1);
		}	
	}
}

