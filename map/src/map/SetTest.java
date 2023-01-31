package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> strSet = new HashSet<>();
		
		strSet.add("100");
		strSet.add("100");
		strSet.add("101");
		strSet.add("102");
		strSet.add("103");
		strSet.add("104");
		
//		for(String str:strSet) {
//			System.out.println(str);
//		}
		strSet.iterator();
		
		Iterator<String> iterStr = strSet.iterator();
		while(iterStr.hasNext()) {
			System.out.println(iterStr.next());
		}
		
		System.out.println(strSet.size());
	
	}
}
