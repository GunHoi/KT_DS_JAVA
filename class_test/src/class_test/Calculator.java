package class_test;

public class Calculator {

	public static void main(String[] args) {
		
		/*
		 * Primitive Type
		 * 	byte, short, int, long, float, double, char, boolean
		 * 
		 * Reference Type
		 *  Primitive Type을 제외한 모든 타입
		 *  
		 * 변수의 생성 방법
		 * Primitive Type 
		 * Type name = value 
		 * 
		 * Reference Type 
		 * Type name = new Type();
		 */ 
		ScoreCalculator scoreCalculator = new ScoreCalculator();
		scoreCalculator.getAverage();
		scoreCalculator.getGrade();
		
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		temperatureConverter.toCel();
		temperatureConverter.toFah();
	}
	
}
