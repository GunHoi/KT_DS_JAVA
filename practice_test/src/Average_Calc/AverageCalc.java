package Average_Calc;

import java.util.ArrayList;
import java.util.List;

public class AverageCalc {

	public static void main(String[] args) {

		double math = 77.7;
		double physics = 66.6;
		double english = 55.5;
		double programming = 44.4;
		
		double avg = (math+physics+english+programming)/4;
		System.out.println(avg);

		System.out.println("\n----배열----\n");
		
		int [] arrInt = new int[3];
		double[] arrDouble = new double[4];
		String[] arrString = new String[5];
	
		arrDouble[0] = math;
		arrDouble[1] = physics;
		arrDouble[2] = english;
		arrDouble[3] = physics;
		System.out.println(arrInt);
		System.out.println(arrDouble);
		System.out.println(arrString);
		System.out.println(arrDouble.length);
		
		double total = 0;
		for (double score : arrDouble) {
			total+=score;
			System.out.println(score);
		}
		System.out.println(total);
		
		System.out.println("\n----리스트----\n");
		
		List<Double> scoreList = new ArrayList<>();
		scoreList.add(math);
		scoreList.add(physics);
		scoreList.add(english);
		scoreList.add(physics);
		System.out.println(scoreList.get(0));
		System.out.println(scoreList.get(1));
		System.out.println(scoreList.get(2));
		System.out.println(scoreList.get(3));
		System.out.println(scoreList.get(4));
	}

}
