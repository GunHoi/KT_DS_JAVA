package com.ktdsuniversity.edu.inf;

import java.util.Random;

public class CalculatorRandomImpl implements Calculator{

	@Override
	public int sum(int number1, int number2) {
		return number1 + number2 + new Random().nextInt();
	}

	@Override
	public int minus(int number1, int number2) {
		return number1 - number2 - new Random().nextInt();
	}
	
}
