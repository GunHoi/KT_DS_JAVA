package access;

/**
 * 모든 멤버가 public인 클래스
 * 
 * @author gunhoe
 *
 */
public class Public {

	/**
	 * 첫 번째 멤버변수
	 */
	private int number1;
	/**
	 * 두 번째 멤버변수 멤버변수는 항상 private으로 보호되어야 한다.
	 */
	private int number2;

	/**
	 * number1 멤버변수의 Getter
	 * 
	 * @return number1
	 */
	public int getNumber1() {
		return number1;
	}

	/**
	 * number1 멤버변수의 Setter
	 * 
	 * @param number1(Main 클래스가 할당한 값)
	 */
	public void setNumber1(int number1) {
		if (number1 < 100) {
			this.number1 = number1;
		}
	}

	/**
	 * number2 멤버변수의 Getter
	 * 
	 * @return number2
	 */
	public int getNumber2() {
		return number2;
	}

	/**
	 * number2 멤버변수의 Setter
	 * 
	 * @param number2
	 */
	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public void add() {
		int result = number1 + number2;
		System.out.println(result);
	}

}
