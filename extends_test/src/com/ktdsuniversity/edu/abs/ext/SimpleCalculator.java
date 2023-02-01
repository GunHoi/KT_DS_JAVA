package com.ktdsuniversity.edu.abs.ext;

/**
 * 추상 클래스를 상속받아 구현한 클래스
 * @author gunhoe
 */
public class SimpleCalculator extends Calculator{

	@Override
	protected int sum(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	protected int minus(int num1, int num2) {
		return num1 - num2;
	}
	
}
