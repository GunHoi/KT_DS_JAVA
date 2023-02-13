package com.ktdsuniversity.edu.constructor;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc1 = new Calculator();
		System.out.println(calc1.sum());
		
		Calculator calc2 = new Calculator(5,6);
		System.out.println(calc2.sum());
		
		Doctor doctor1 = new Doctor("최신 컴퓨터","펜");
		String result = doctor1.examination();
		System.out.println(result);
		
		Doctor doctor2 = new Doctor("오래된 컴퓨터","청진기");
		result = doctor2.examination();
		System.out.println(result);
		
		Doctor doctor3 = new Doctor("종이","손");
		result = doctor3.examination();
		System.out.println(result);
	}

}
