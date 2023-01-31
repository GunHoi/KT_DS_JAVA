package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 100);
		map.put("C", 80);
		map.put("C#", 70);
		
		System.out.println("Java: "+map.get("Java"));
		System.out.println("C: "+map.get("C"));
		System.out.println("C#: "+map.get("C#"));
		
		map.put("Java", 90);
		System.out.println("Java: "+map.get("Java"));
		
		map.remove("Java");
		System.out.println("Java: "+map.get("Java"));
		System.out.println("Scala: "+map.get("Scala"));
		
		System.out.println("Python: "+map.get("Python"));
		if(!map.containsKey("Python")) {
			map.put("Python", 50);
		}
		System.out.println("Python: "+map.get("Python"));
		
		Map<Integer, List<String>> matrix = new HashMap<>();
		//2차원배열이다 but 순서가 보장이 되지 않는다.
	}
}
