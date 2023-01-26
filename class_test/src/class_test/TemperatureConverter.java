package class_test;

public class TemperatureConverter {
	
	/**
	 * 섭씨를 화씨로 변경
	 */
	public void toFah() {
		int cel = 30;
		double fah = (cel * 1.8) + 32;
		System.out.println("섭씨를 화씨로 변경\n" + cel + "'C -> " + fah + "'F\n");
	}
	
	/**
	 * 화씨를 섭씨로 변경
	 */
	public void toCel() {
		double fah2 = 81.2;
		int cel2 = (int) ((fah2 - 32) / 1.8);
		System.out.println("화씨를 섭씨로 변경\n" + fah2 + "'F -> " + cel2 + "'C");
	}
	
}
