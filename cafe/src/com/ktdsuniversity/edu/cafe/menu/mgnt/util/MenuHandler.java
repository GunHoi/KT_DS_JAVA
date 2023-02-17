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
		int itemType = 0;
		if (menu == 1 || menu == 2 || menu == 3 || menu == 4) {
			printHandler.printItemTypeMenu();
			InputHandler inputHandler = new InputHandler();
			itemType = inputHandler.InputItemType();
		}
		if (menu == 1) {
			runCreate(service, itemType);
		} else if (menu == 2) {
			runUpdate(service, itemType);
		} else if (menu == 3) {
			runDelete(service, itemType);
		} else if (menu == 4) {
			runRead(service, itemType);
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
	private void runCreate(MenuMgntService service, int itemType) {
		if (validationHandler.checkItemType(itemType)) {
			System.out.print("등록할 ");
			String itemName = inputHandler.InputItemName();
			if (validationHandler.isNotExistsValue(itemType, itemName, service)) {
				setCreate(itemType, itemName, inputHandler.InputItemPrice(), inputHandler.InputItemQuantity(), service);
			} else {
				printHandler.printItemIsExists();
				runCreate(service, itemType);
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runCreate(service, itemType);
		} 
	}
	
	/**
	 * 상품을 수정하는 메소드
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runUpdate(MenuMgntService service, int itemType) {
		if (validationHandler.checkItemType(itemType)) {
			System.out.print("수정할 ");
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
			runCreate(service, itemType);
		} 
	}
	
	/**
	 * 상품을 삭제하는 메소드
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runDelete(MenuMgntService service, int itemType) {
		if (validationHandler.checkItemType(itemType)) {
			System.out.print("삭제할 ");
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
			runCreate(service, itemType);
		} 
	}
	
	/**
	 * 상품을 읽어오는 메소드(카테고리 별)
	 * @param service MenuMgntService 객체 -> Data를 전달하는 객체
	 */
	private void runRead(MenuMgntService service, int itemType) {
		
		if (validationHandler.checkItemType(itemType)) {
			System.out.print("조회할 ");
			System.out.println("<" + validationHandler.changeItemType(itemType) + ">");
			
			for (MenuMgntVO item : service.readSome(validationHandler.changeItemType(itemType))) {
				printHandler.printReadMessage(item);
			}
		} else if (itemType != 5){
			printHandler.printWrongInput();
			runCreate(service, itemType);
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


//	/**
//	 * 메뉴를 입력받는 메소드
//	 * @return 선택한 메뉴 번호(only int)
//	 */
//	public int InputMenu() {
//		
//		System.out.print("메뉴를 입력하세요(숫자): ");
//		// 숫자인지 확인
//		String menu = userInput();
//		if (validationHandler.checkIsNumber(menu)) {
//			return Integer.parseInt(menu);
//		} 
//		printHandler.printWrongInput();
//		return InputMenu();
//	}
//	
//	/**
//	 * 메뉴 타입(커피, 음료, 티, 디저트)를 입력받는 메소드
//	 * @return 선택한 메뉴 번호(Only 숫자(int))
//	 */
//	public int InputItemType() {
//		System.out.print("메뉴 타입을 입력하세요(숫자): ");
//		// 숫자인지 확인
//		String itemType = userInput();
//		if (validationHandler.checkIsNumber(itemType)) {
//			return Integer.parseInt(itemType);
//		} 
//		printHandler.printWrongInput();
//		
//		return InputItemType();
//	}
//
//	/**
//	 * 상품명(아이템명)을 입력받는 메소드
//	 * @return 상품명(아이템명) (Only 한글, 영어)
//	 */
//	public String InputItemName() {
//		System.out.print("아이템명을 입력하세요(문자): ");
//		// 문자인지 확인
//		String itemName = userInput();
//		if(validationHandler.checkIsString(itemName)) {
//			return itemName;
//		}
//		printHandler.printWrongInput();
//		
//		return InputItemName();
//	}
//
//	/**
//	 * 상품(아이템)가격을 입력받는 메소드
//	 * @return 상품(아이템)가격 (Only 숫자(int))
//	 */
//	public int InputItemPrice() {
//		System.out.print("아이템 가격을 입력하세요(숫자): ");
//		// 숫자인지 확인
//		String itemPrice = userInput();
//		if (validationHandler.checkIsNumber(itemPrice)) {
//			return Integer.parseInt(itemPrice);
//		} 
//		printHandler.printWrongInput();
//		
//		return InputItemPrice();
//	}
//	
//	/**
//	 * 상품(아이템)수량을 입력받는 메소드
//	 * @return 상품(아이템)수량 (Only 숫자(int))
//	 */
//	public int InputItemQuantity() {
//		System.out.print("아이템 수량을 입력하세요(숫자): ");
//		// 숫자인지 확인
//		String itemQuantity = userInput();
//		if (validationHandler.checkIsNumber(itemQuantity)) {
//			return Integer.parseInt(itemQuantity);
//		} 
//		printHandler.printWrongInput();
//		
//		return InputItemQuantity();
//	}
//
//	/**
//	 * 상품(아이템) 위치(인덱스)를 입력받는 메소드
//	 * @return 상품(아이템) 위치(인덱스) (Only 숫자(int))
//	 */
//	public int InputItemIdx() {
//		System.out.print("아이템 인덱스를 입력하세요(숫자): ");
//		// 숫자인지 확인
//		String itemIdx = userInput();
//		if (validationHandler.checkIsNumber(itemIdx)) {
//			return Integer.parseInt(itemIdx);
//		} 
//		printHandler.printWrongInput();
//		
//		return InputItemIdx();
//	}
//	
//	/**
//	 * 상품(아이템)의 품절여부를 입력받는 메소드
//	 * @return 상품(아이템)의 품절여부 / true -> 품절 / false -> 판매중 (boolean)
//	 */
//	public boolean InputIsSoldOut() {
//		System.out.print("품절 여부를 입력하세요(Y-품절 / N-품절해제): ");
//		// 문자 인지 확인
//		String inputYN = userInput();
//		if (validationHandler.checkIsYN(inputYN)) {
//			if (inputYN.equals("y") || inputYN.equals("Y")) {
//				return true;
//			} else if (inputYN.equals("n") || inputYN.equals("N")) {
//				return false;
//			}
//		}
//		printHandler.printWrongInput();
//		
//		return InputIsSoldOut();		
//	}
//
//	/**
//	 * 사용자 입력을 받는 메소드
//	 * @return 사용자 입력
//	 */
//	public String userInput() {
//		String userInput = scan.nextLine();
//
//		return userInput;
//	}

//	/**
//	 * itemType 입력이 1,2,3,4인지 확인
//	 * @param itemType 사용자가 입력한 itemType 
//	 * @return 입력이 1,2,3,4 중 하나이면 true / 그 외 숫자이면 false;
//	 */
//	public boolean checkItemType(int itemType) {
//		if (itemType == 1 || itemType == 2 || itemType == 3 || itemType == 4) {
//			return true;
//		} 
//		return false;
//	}
//
//	/**
//	 * 입력받은 itemType(숫자)를 문자로 변경하는 메소드
//	 * @param itemType 사용자가 입력한 itemType(1,2,3,4)
//	 * @return 1,2,3,4 숫자에 맞는 itemType(문자) 1 - 커피 / 2 - 음료 / 3 - 티 / 4 - 디저트
//	 */
//	public String changeItemType(int itemType) {
//		if (itemType == 1) {
//			return "커피";
//		} else if (itemType == 2) {
//			return "음료";
//		} else if (itemType == 3) {
//			return "티";
//		} else if (itemType == 4) {
//			return "디저트";
//		} else {
//			return "없음";
//		}
//	}
	
}
