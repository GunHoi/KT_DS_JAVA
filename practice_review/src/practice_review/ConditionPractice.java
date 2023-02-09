package practice_review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ConditionPractice {

	public static void main(String[] args) {
		List <Integer> ageList = new ArrayList<>();
		Random random = new Random();
		
		for (int i=0;i<5;i++) {
			ageList.add(random.nextInt(50)+1);
		}
		
		for(int age : ageList) {
			if (age > 19) {
				System.out.println(age+"는 성인입니다.");
			} else {
				System.out.println(age+"는 미성년입니다.");
			}
		}
		
		List<Integer> scoreList = new ArrayList<>();
		
		for (int i=0;i<5;i++) {
			scoreList.add(random.nextInt(100)+1);
		}
		
		System.out.println("==================================================");
		String grade = "";
		for (int score:scoreList) {
			if (score>=90) {
				grade = "A";
			} else if (score>=80) {
				grade = "B";
			} else if (score>=70){
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(score+"는 "+grade);
		}
		
		System.out.println("==================================================");
		Map<String, Integer> scoreMap = new HashMap<>();
		scoreMap.put("학생1", scoreList.get(0));
		scoreMap.put("학생2", scoreList.get(1));
		scoreMap.put("학생3", scoreList.get(2));
		scoreMap.put("학생4", scoreList.get(3));
		scoreMap.put("학생5", scoreList.get(4));
		
		grade = "";
		for (String key : scoreMap.keySet()) {
			if(scoreMap.get(key) >= 90) {
				grade = "A";
			} else if (scoreMap.get(key)>=80) {
				grade = "B";
			} else if (scoreMap.get(key)>=70){
				grade = "C";
			} else if (scoreMap.get(key) >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(scoreMap.get(key)+"는 "+grade);
		}
		
		double avgValue = 89.9;
		int countLate = 0;
		boolean isPass = avgValue >= 90;
		boolean isntLate = countLate == 0;
		
		if(isPass && isntLate) {
			System.out.println("90점을 넘고, 지각/결석이 0회입니다.");
		}else {
			System.out.println("두 조건을 모두 만족하지 못했습니다.");
		}
		
		int myMoney = 20000;
		int myAge = 12;
		boolean haveMoney = myMoney>=18000;
		boolean isUpperAge = myAge >= 12;
		
		if(haveMoney && isUpperAge) {
			System.out.println("관람 가능");
		}else {
			System.out.println("관람 불가능");
		}
		
		String myGradeType = "";
		int myGrade = 76;
		boolean isUpper95 = myGrade>=95;
		boolean isUpper90 = myGrade>=90 && myGrade<95;
		boolean isUpper85 = myGrade>=85 && myGrade<90;
		boolean isUpper80 = myGrade>=80 && myGrade<85;
		boolean isUpper70 = myGrade>=70 && myGrade<80;
		boolean isUpper60 = myGrade>=60 && myGrade<70;
		
		if (isUpper95) {
			myGradeType = "A+";
		} else if(isUpper90) {
			myGradeType = "A";
		} else if(isUpper85) {
			myGradeType = "B+";
		} else if(isUpper80) {
			myGradeType = "B";
		} else if(isUpper70) {
			myGradeType = "C";
		} else if(isUpper60) {
			myGradeType = "D";
		} else {
			myGradeType = "F";
		}
		System.out.println("성적은 "+myGradeType);
		
		myGradeType="F";
		if (isUpper95) {
			myGradeType = "A+";
		} else if(isUpper90) {
			myGradeType = "A";
		} else if(isUpper85) {
			myGradeType = "B+";
		} else if(isUpper80) {
			myGradeType = "B";
		} else if(isUpper70) {
			myGradeType = "C";
		} else if(isUpper60) {
			myGradeType = "D";
		} 
		System.out.println("성적은 "+myGradeType);
	}

}
