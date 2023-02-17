package com.ktdsuniversity.edu.cafe.menu.mgnt.util;

import java.util.Scanner;

public class InputHandler {
	
	private static Scanner scan;
	ValidationHandler validationHandler = new ValidationHandler();
	PrintHandler printHandler = new PrintHandler();
	
	static {
		scan = new Scanner(System.in);
	}
	/**
	 * 메뉴를 입력받는 메소드
	 * @return 선택한 메뉴 번호(only int)
	 */
	public int InputMenu() {
		
		System.out.print("메뉴를 입력하세요(숫자): ");
		// 숫자인지 확인
		String menu = userInput();
		if (validationHandler.checkIsNumber(menu)) {
			return Integer.parseInt(menu);
		} 
		printHandler.printWrongInput();
		return InputMenu();
	}
	
	/**
	 * 메뉴 타입(커피, 음료, 티, 디저트)를 입력받는 메소드
	 * @return 선택한 메뉴 번호(Only 숫자(int))
	 */
	public int InputItemType() {
		System.out.print("메뉴 타입을 입력하세요(숫자): ");
		// 숫자인지 확인
		String itemType = userInput();
		if (validationHandler.checkIsNumber(itemType)) {
			return Integer.parseInt(itemType);
		} 
		printHandler.printWrongInput();
		
		return InputItemType();
	}

	/**
	 * 상품명(아이템명)을 입력받는 메소드
	 * @return 상품명(아이템명) (Only 한글, 영어)
	 */
	public String InputItemName() {
		System.out.print("아이템명을 입력하세요(문자): ");
		// 문자인지 확인
		String itemName = userInput();
		if(validationHandler.checkIsString(itemName)) {
			return itemName;
		}
		printHandler.printWrongInput();
		
		return InputItemName();
	}

	/**
	 * 상품(아이템)가격을 입력받는 메소드
	 * @return 상품(아이템)가격 (Only 숫자(int))
	 */
	public int InputItemPrice() {
		System.out.print("아이템 가격을 입력하세요(숫자): ");
		// 숫자인지 확인
		String itemPrice = userInput();
		if (validationHandler.checkIsNumber(itemPrice)) {
			return Integer.parseInt(itemPrice);
		} 
		printHandler.printWrongInput();
		
		return InputItemPrice();
	}
	
	/**
	 * 상품(아이템)수량을 입력받는 메소드
	 * @return 상품(아이템)수량 (Only 숫자(int))
	 */
	public int InputItemQuantity() {
		System.out.print("아이템 수량을 입력하세요(숫자): ");
		// 숫자인지 확인
		String itemQuantity = userInput();
		if (validationHandler.checkIsNumber(itemQuantity)) {
			return Integer.parseInt(itemQuantity);
		} 
		printHandler.printWrongInput();
		
		return InputItemQuantity();
	}

	/**
	 * 상품(아이템) 위치(인덱스)를 입력받는 메소드
	 * @return 상품(아이템) 위치(인덱스) (Only 숫자(int))
	 */
	public int InputItemIdx() {
		System.out.print("아이템 인덱스를 입력하세요(숫자): ");
		// 숫자인지 확인
		String itemIdx = userInput();
		if (validationHandler.checkIsNumber(itemIdx)) {
			return Integer.parseInt(itemIdx);
		} 
		printHandler.printWrongInput();
		
		return InputItemIdx();
	}
	
	/**
	 * 상품(아이템)의 품절여부를 입력받는 메소드
	 * @return 상품(아이템)의 품절여부 / true -> 품절 / false -> 판매중 (boolean)
	 */
	public boolean InputIsSoldOut() {
		System.out.print("품절 여부를 입력하세요(Y-품절 / N-품절해제): ");
		// 문자 인지 확인
		String inputYN = userInput();
		if (validationHandler.checkIsYN(inputYN)) {
			if (inputYN.equals("y") || inputYN.equals("Y")) {
				return true;
			} else if (inputYN.equals("n") || inputYN.equals("N")) {
				return false;
			}
		}
		printHandler.printWrongInput();
		
		return InputIsSoldOut();		
	}

	/**
	 * 사용자 입력을 받는 메소드
	 * @return 사용자 입력
	 */
	public String userInput() {
		String userInput = scan.nextLine();

		return userInput;
	}
}
