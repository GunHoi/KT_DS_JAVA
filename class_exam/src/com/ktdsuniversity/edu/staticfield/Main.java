package com.ktdsuniversity.edu.staticfield;

public class Main {
	
	private int number = 0;
	
	public static void main(String[] args) {
		
//		System.out.println(number); //static 에서 instance인 number에 접근하려 해서 error
		
		int num = StaticTest.NUM;
		String str = StaticTest.STR;
		
		System.out.println(num);
		System.out.println(str);
		
		StaticTest.printHello();
		StaticTest.printHello("홍길동");
	}
}
