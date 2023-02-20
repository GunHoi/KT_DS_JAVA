package com.ktdsuniversity.edu.cafe.menu.mgnt.util;

import java.util.List;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class MenuHandler {
	
	private PrintHandler printHandler;
	private InputHandler inputHandler;
	private ValidationHandler validationHandler;
	
	public void start(MenuMgntService service) {
		while (true) {
			printHandler.printMenu();
			if (selectMenu(inputHandler.InputMenu(), service)) {
				break;
			}
		}
	}
	
	public MenuHandler() {
		inputHandler = new InputHandler();
		printHandler = new PrintHandler();
		validationHandler = new ValidationHandler();
	}
	
	/**
	 * 선택한 메뉴에 따른 동작을 하는 메소드
	 * @param menu : 사용자가 선택한 메뉴
	 * @param service : MenuMgntService 객체 -> Data를 전달하는 객체
	 * @return true : 프로그램 종료 / false : 프로그램 반복 - 다시 메뉴 선택
	 */
	public boolean selectMenu(int menu, MenuMgntService service) {
		if (menu == 1) {
			runCreate(service);
		} else if (menu == 2) {
			runUpdate(service);
		} else if (menu == 3) {
			runDelete(service);
		} else if (menu == 4) {
			runRead(service);
		} else if (menu == 5) {
			runReadAll(service);
		} else if (menu == 6) {
			System.out.println("프로그램을 종료합니다.");
			return true;
		} else {
			printHandler.printWrongInput();
		}
		return false;
	}
	
	/**
	 * 상품을 등록하는 메소드
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runCreate(MenuMgntService service) {
		printHandler.printItemTypeMenu();
		
		InputHandler inputHandler = new InputHandler();
		int itemType = inputHandler.InputItemType();
		
		if (validationHandler.checkItemType(itemType)) {
			String itemName = inputHandler.InputItemName();
			if (validationHandler.isNotExistsValue(itemType, itemName, service)) {
				setCreate(itemType, itemName, inputHandler.InputItemPrice(), inputHandler.InputItemQuantity(), service);
			} else {
				printHandler.printItemIsExists();
				runCreate(service);
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runCreate(service);
		} 
	}
	
	/**
	 * 상품을 수정하는 메소드
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runUpdate(MenuMgntService service) {
		printHandler.printItemTypeMenu();
		
		InputHandler inputHandler = new InputHandler();
		int itemType = inputHandler.InputItemType();
		
		if (validationHandler.checkItemType(itemType)) {
			printHandler.printIndexList(itemType, service);
			int itemIdx = inputHandler.InputItemIdx();
			
			if (itemIdx >= service.readSome(validationHandler.changeItemType(itemType)).size()) {
				printHandler.printItemIsNotExists();
			} else {
				String itemName = inputHandler.InputItemName();
				if (validationHandler.isNotExistsValue(itemType, itemName, service)) {
					setUpdate(itemType, itemIdx, itemName, inputHandler.InputItemPrice(), inputHandler.InputItemQuantity(), inputHandler.InputIsSoldOut(), service);
				}
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runUpdate(service);
		} 
	}
	
	/**
	 * 상품을 삭제하는 메소드
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runDelete(MenuMgntService service) {
		printHandler.printItemTypeMenu();
		
		InputHandler inputHandler = new InputHandler();
		int itemType = inputHandler.InputItemType();
		
		if (validationHandler.checkItemType(itemType)) {
			printHandler.printIndexList(itemType, service);
			int itemIdx = inputHandler.InputItemIdx();
			
			if (itemIdx >= service.readSome(validationHandler.changeItemType(itemType)).size()) {
				printHandler.printItemIsNotExists();
			} else {
				service.delete(validationHandler.changeItemType(itemType), itemIdx);
				System.out.println("삭제되었습니다.");
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runDelete(service);
		} 
	}
	
	/**
	 * 상품을 읽어오는 메소드(카테고리 별)
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runRead(MenuMgntService service) {
		printHandler.printItemTypeMenu();
		
		InputHandler inputHandler = new InputHandler();
		int itemType = inputHandler.InputItemType();
		
		if (validationHandler.checkItemType(itemType)) {
			System.out.println("<" + validationHandler.changeItemType(itemType) + ">");
			
			for (MenuMgntVO item : service.readSome(validationHandler.changeItemType(itemType))) {
				printHandler.printReadMessage(item);
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runRead(service);
		} 
	}
	
	/**
	 * 상품을 읽어오는 메소드(전체)
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runReadAll(MenuMgntService service) {
		for (String key : service.readAll().keySet()) {
			List<MenuMgntVO> value = service.readAll().get(key);
			
			if (value.size() != 0) {
				System.out.println("<" + key + ">");
			} else {
				printHandler.printItemIsNotExists();
			}
			
			for (MenuMgntVO item : value) {
				printHandler.printReadMessage(item);
			}
		}
	}
	
	/**
	 * service 객체에 생성할 값들을 넣어주는 메소드
	 * @param itemType 타입(커피, 음료, 티, 디저트)
	 * @param itemName 상품명
	 * @param itemPrice 상품가격
	 * @param itemQuantity 상품수량
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void setCreate(int itemType, String itemName, int itemPrice, int itemQuantity, MenuMgntService service) {
		MenuMgntVO mgnt = new MenuMgntVO();

		mgnt.setItemName(itemName);
		mgnt.setPrice(itemPrice);
		mgnt.setQuantity(itemQuantity);
		mgnt.setSoldOut(false); // default
		service.create(validationHandler.changeItemType(itemType), mgnt);

		System.out.println(itemName + "이(가) 등록되었습니다.");
	}

	/**
	 * service 객체에 수정할 값들을 넣어주는 메소드
	 * @param itemType 타입(커피, 음료, 티, 디저트)
	 * @param itemIdx 타입에서 선택할 아이템의 번호
	 * @param itemName 상품명
	 * @param itemPrice 상품가격
	 * @param itemQuantity 상품수량
	 * @param isSoldOut 상품이 품절됐는지 여부
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void setUpdate(int itemType, int itemIdx, String itemName, int itemPrice, int itemQuantity, boolean isSoldOut, MenuMgntService service) {
		MenuMgntVO mgnt = new MenuMgntVO();

		mgnt.setItemName(itemName);
		mgnt.setPrice(itemPrice);
		mgnt.setQuantity(itemQuantity);
		mgnt.setSoldOut(isSoldOut);
		service.update(validationHandler.changeItemType(itemType), itemIdx, mgnt);

		System.out.println(itemName + "로 수정되었습니다."+isSoldOut);
	}
}
