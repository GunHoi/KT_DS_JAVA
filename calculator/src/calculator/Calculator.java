package calculator;

/**
 * 사칙연산 클래스
 * 
 * @author gunhoe
 *
 */
public class Calculator {

	// 더하기 (정수,정수) : 정수
	public int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	// 빼기 (정수,정수) : 정수
	public int minus(int num1, int num2) {
		int result;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}

	// 곱하기 (정수,정수) : 정수
	public int multi(int num1, int num2) {
		int result = num1 * num2;
		return result;
	}

	// 나누기 (정수,정수) : 실수
	public double divide(int num1, int num2) {
		double result;
		if (num1 == 0 || num2 == 0) {
			return 0;
		}
		result = (double) num1 / num2;
		return result;
	}

	// 나머지 구하기 (정수,정수) : 정수
	public int remain(int num1, int num2) {
		int result = num1 % num2;
		return result;
	}

}
