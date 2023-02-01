package hello_java;

/**
 * 섭씨 <-> 화씨 변경 프로그램
 * 
 * @author gunhoe
 * @since '23.01.18
 */
public class CelToFah {

	/**
	 * 섭씨를 화씨로 변경
	 */
	public static void celToFah() {
		int cel = 30;
		double fah = (cel * 1.8) + 32;
		System.out.println("섭씨를 화씨로 변경\n" + cel + "'C -> " + fah + "'F\n");
	}

	/**
	 * 화씨를 섭씨로 변경
	 */
	public static void fahToCel() {
		double fah2 = 81.2;
		int cel2 = (int) ((fah2 - 32) / 1.8);
		System.out.println("화씨를 섭씨로 변경\n" + fah2 + "'F -> " + cel2 + "'C");
	}

	public static void main(String[] args) {
		
		System.out.println("시작");
		celToFah();
		
		fahToCel();
		System.out.println("끝");
	}

}
