package hello_java;

import java.util.Scanner;
/**
 * 변수 범위 학습한 파일
 * @author 이건회
 * @since 2023-01-18
 * @version 1.0
 */
public class Scope {

	static Scanner scanner = new Scanner(System.in);
	/**
	 * 무언가를 입력 받을 수 있는 변수
	 * @param args 아규먼트
	 */
	public static void main(String[] args) {	
		System.out.print("이름을 입력하세요: ");
		String name = scanner.nextLine();
		System.out.println("이름은 "+name+"입니다.");
		//한줄 주석
		/*
		 * 여러줄 주석
		 */
	}

}
