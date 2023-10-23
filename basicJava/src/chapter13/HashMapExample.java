package chapter13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 키가 동일해서 마지막값으로 덮어씀(기존데이터 날라감)
		System.out.println(map.size()); // 3
		// 가장 일반적인 데이터 검색 방식(키를 통해)
		System.out.println("홍길동의 점수: " + map.get("홍길동")); // 홍길동의 점수: 95
		
		//모든 데이터 찾기
		// 1.Entry 이용하는 방식
		//1-1 iterator
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry);
		}
		//1-2 foreach
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		//1-3 set의 foreach 메소드 호출
		entrySet.forEach(System.out::println);
		
		// 2.Key를 이용하는 방식
		Set<String> keySet = map.keySet();
		//2-1 iterator
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + "=" + map.get(key));
		}
		//2-2 foreach
		for(String key : keySet) {
			System.out.println(key + "=" + map.get(key));
		}
		//map 안의 데이터 확인
		System.out.println(map); // {key=value, key=value}
		
		// 3.value를 이용하는 방식
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			System.out.println(value);
		}
		map.clear(); // 모든 entry 삭제 (hashMap은 그대로 안의 데이터만 삭제)
		System.out.println(map.size()); // 0
	}
}
