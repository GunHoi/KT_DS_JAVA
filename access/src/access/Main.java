package access;

public class Main {

	public static void main(String[] args) {
		
		Public pub = new Public();
		pub.add();
		pub.setNumber1(99);
		pub.setNumber1(101);	//조건(100미만)에 의해 할당되지 않는다.
		
		pub.setNumber2(1101);
		
		int publicNumberOne = pub.getNumber1();
		System.out.println(publicNumberOne);
		
		int publicNumberTwo = pub.getNumber2();
		System.out.println(publicNumberTwo);
		pub.add();
	}

}
