package com.ktdsuniversity.edu.cafe.menu.mgnt.util;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

/**
 * 
 * @author gunhoe
 *
 */
//printMenu, selectMenu, InputMenu는 public 나머지는 private
public class PrintHandler {
	/**
	 * 품절 여부를 출력하는 메소드
	 * @param item 선택한 아이템
	 */
	public void printIsSoldOut(MenuMgntVO item) {
		if (item.isSoldOut()) {
			System.out.print("(품절)");
		} else {
			System.out.print("(판매중)");
		}
	}
	
	/**
	 * 상품 정보를 모두 출력하는 메소드
	 * @param item 선택한 아이템
	 */
	public void printReadMessage(MenuMgntVO item) {
		System.out.print(item.getItemName());
		printIsSoldOut(item);
		System.out.print(" : "+item.getPrice()+"원");
		System.out.println(" / "+item.getQuantity()+"개 보유 중 ");
	}
	
	/**
	 * 선택한 카테고리를 모두 보여주는 메소드
	 * @param itemType 선택한 타입(카테고리) (커피, 음료, 티, 디저트)
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	public void printIndexList(int itemType, MenuMgntService service) {
		ValidationHandler validationHandler = new ValidationHandler();
		System.out.print("[");
		for(MenuMgntVO item : service.readSome(validationHandler.changeItemType(itemType))) {
			System.out.print(item.getItemName()+" ");
		}
		System.out.println("]");
	}
	
	/**
	 * 메뉴를 출력하는 메소드
	 */
	public void printMenu() {
		System.out.println("\n============================\r\n" 
				+ "1. 등록\r\n" 
				+ "2. 수정\r\n" 
				+ "3. 삭제\r\n"
				+ "4. 조회(종목별로)\r\n" 
				+ "5. 조회(전체)\r\n" 
				+ "6. 종료\r\n" 
				+ "============================\n");
	}
	
	/**
	 * 타입(카테고리)를 출력하는 메소드
	 */
	public void printItemTypeMenu() {
		System.out.println("\n============================\r\n" 
				+ "1. 커피\r\n" 
				+ "2. 음료\r\n" 
				+ "3. 티\r\n" 
				+ "4. 디저트\r\n"
				+ "5. 뒤로가기\r\n" 
				+ "============================\n");
	}
	
	/**
	 * 잘못된 입력 시 출력 문구 - "잘못된 입력입니다."
	 */
	public void printWrongInput() {
		System.out.println("잘못된 입력입니다.");
	}
	
	public void printItemIsNotExists() {
		System.out.println("아이템이 존재하지 않습니다.");
	}
	
	public void printItemIsExists() {
		System.out.println("이미 존재하는 아이템 입니다.");
	}
}
