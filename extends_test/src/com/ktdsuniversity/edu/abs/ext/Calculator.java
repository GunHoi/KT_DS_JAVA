package com.ktdsuniversity.edu.abs.ext;

/**
 * 추상 클래스
 * @author gunhoe
 */
public abstract class Calculator {
	
	public int calculate(String calcType, int num1, int num2) {
		if(calcType.equals("+")) {
			return sum(num1, num2);
		}else if(calcType.equals("-")) {
			return minus(num1, num2);
		}
		return 0;
	}
	
	protected abstract int sum(int num1, int num2);
	protected abstract int minus(int num1, int num2);
	
}
