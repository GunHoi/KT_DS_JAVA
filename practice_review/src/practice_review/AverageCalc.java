package practice_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageCalc {

	public static void main(String[] args) {
		double math = 77.7;
		double physics = 66.6;
		double english = 55.5;
		double programming = 44.4;
		
		double avg1 = (math+physics+english+programming)/4;
		
		List <Double> scoreList = new ArrayList<>();
		scoreList.add(math);
		scoreList.add(physics);
		scoreList.add(english);
		scoreList.add(programming);
		
		double avg2 = (scoreList.get(0) + scoreList.get(1) +scoreList.get(2) +scoreList.get(3))/4;
		
		Map <String, Double> scoreMap = new HashMap<>();
		scoreMap.put("수학", 77.7);
		scoreMap.put("물리", 66.6);
		scoreMap.put("영어", 55.5);
		scoreMap.put("프로그래밍", 44.4);
		
		double avg3 = (scoreMap.get("수학")+scoreMap.get("물리")+scoreMap.get("영어")+scoreMap.get("프로그래밍"))/4;
		
		System.out.println(avg1);
		System.out.println(avg2);
		System.out.println(avg3);
		
	}

}
