package com.ktdsuniversity.edu.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void printSumResult(Computable computable) {
		int sumResult = computable.sum(10, 20);
		System.out.println(sumResult);
	}
	
	public static void printData(Printable printable) {
		printable.print("홍길동");
	}
	
	public static void main(String[] args) {	
		//익명 클래스
		printSumResult(new Computable() {
			@Override
			public int sum(int numberOne, int numberTwo) {
				return numberOne+numberTwo;
			}
		});
		//람다 함수
		printSumResult((num1, num2) -> num1 + num2);
		printSumResult((num1, num2) -> {
			if(num1 == 10) {
				num1+=7;
			}
			return num1 + num2;
		});
		printData((data) -> System.out.println(data+ "입니다."));
		printData( System.out::println );
		printData((data)->{
			System.out.println(data+ "입니다.");
		});
		
		List <Integer> intList = List.of(10, 20, 30, 40, 50);	//Java9 이상
		List <Integer> intList2 = Arrays.asList(10, 20, 30, 40, 50);	//Java8 이하
		
		intList.forEach(System.out::println);	
		intList2.forEach(System.out::println);
	}
}
