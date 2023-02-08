package lotto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class LottoPractice {

	public static void main(String[] args) {
		List <Integer> lotto = new ArrayList<>();
		Random random = new Random();

		while(lotto.size()<7) {
			int randomNumber = random.nextInt(45)+1;
			if(!lotto.contains(randomNumber)) {
				lotto.add(randomNumber);
			}
//			if(lotto.indexOf(randomNumber) == -1) {
//				lotto.add(randomNumber);
//			}
		}
		lotto.forEach(num->System.out.println(num));

		System.out.println("\n\nmap\n");
		Map<String, Integer> scores = new HashMap<>();
		scores.put("Java", 100);
		scores.put("C#", 90);
		scores.put("C", 70);
		scores.put("Python", 50);
		scores.remove("Python");
		scores.put("C", 7777777);
		
		System.out.println(scores);
		
		int javaValue = scores.get("Java");
		
		scores.remove("f");
		
		System.out.println(javaValue);
		
		System.out.println(scores.get("Python"));
		System.out.println(scores.get("a"));
		
		System.out.println(scores.containsKey("C#"));
		System.out.println(scores.size());
		
		scores.clear();
		System.out.println(scores);
	}

}
