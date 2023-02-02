package com.ktdsuniversity.edu.calculator;

import java.util.Scanner;

import com.ktdsuniversity.edu.exceptions.NotSupportAgeException;
import com.ktdsuniversity.edu.util.NumberUtil;

public class Calculator {
	public static void checkAge(int age) {
		if ( age > 150 ) {
			throw new NotSupportAgeException("151세 이상은 입력할 수 없습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		checkAge(10);
		try {
			checkAge(200);
		}
		catch(NotSupportAgeException nsae) {
			System.out.println(nsae.getMessage());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력: ");
		String string = scanner.nextLine();
		
		// byte로 변경
		byte b = NumberUtil.toByte(string, (byte)99 );
		System.out.println("byte: "+b);
		
		short s = NumberUtil.toShort(string, (short)99 );
		System.out.println("short: "+s);
		
		int i = NumberUtil.toInteger(string, 99);
		System.out.println("int: "+i);
		
		long l = NumberUtil.toLong(string, 99l );
		System.out.println("long: "+l);
		
		float f = NumberUtil.toFloat(string, 99f);
		System.out.println("float: "+f);
		
		double d = NumberUtil.toDouble(string, 99);
		System.out.println("double: "+d);
		
		
		scanner.close();
	}
}
