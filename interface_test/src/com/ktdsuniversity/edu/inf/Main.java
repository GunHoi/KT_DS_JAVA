package com.ktdsuniversity.edu.inf;

public class Main {

	public static void calculate(Calculator calculator) {
		//calculator가 CalculatorNormalImpl의 객체인지 확인하는 코드
		if(calculator instanceof CalculatorNormalImpl) {
			System.out.println(calculator.sum(20, 10));
			System.out.println(calculator.minus(20, 10));
		}
	}
	
	public static void main(String[] args) {
		// 인터페이스명 변수명 = new 구현클래스명();
		Calculator calc1 = new CalculatorNormalImpl();
		System.out.println(calc1.sum(20, 10));
		System.out.println(calc1.minus(20, 10));
		// System.out.println(calc1.divide(20, 10)); 인터페이스에 존재하지 않기 때문에 사용 불가
		
		CalculatorNormalImpl calcImp = new CalculatorNormalImpl();
		System.out.println("\n"+calcImp.divide(20, 10)+"\n");
		
		Calculator calc2 = new CalculatorRandomImpl();
		System.out.println(calc2.sum(20, 10));
		System.out.println(calc2.minus(20, 10)+"\n");
		
		calculate(new CalculatorNormalImpl());
		calculate(new CalculatorRandomImpl());
	}

}
