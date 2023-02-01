package com.ktdsuniversity.edu.inf;

public class CalculatorNormalImpl implements Calculator{

	@Override
	public int sum(int number1, int number2) {
		return number1 + number2;
	}

	@Override
	public int minus(int number1, int number2) {
		return number1 - number2;
	}
	
	public int divide(int number1, int number2) {
		return number1/number2;
	}
}
