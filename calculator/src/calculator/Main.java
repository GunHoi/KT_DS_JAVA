package calculator;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		int addResult = calc.sum(10, 10);

		int subResult1 = calc.minus(10, 3);
		int subResult2 = calc.minus(5, 10);
		int subResult3 = calc.minus(5, 5);

		int mulResult = calc.multi(5, 2);

		double divResult1 = calc.divide(50, 3);
		double divResult2 = calc.divide(50, 0);
		double divResult3 = calc.divide(0, 3);

		int remReuslt = calc.remain(50, 3);

		System.out.println(addResult);
		System.out.println(subResult1);
		System.out.println(subResult2);
		System.out.println(subResult3);
		System.out.println(mulResult);
		System.out.println(divResult1);
		System.out.println(divResult2);
		System.out.println(divResult3);
		System.out.println(remReuslt);
	}

}
