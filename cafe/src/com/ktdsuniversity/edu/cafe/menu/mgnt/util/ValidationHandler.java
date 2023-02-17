package com.ktdsuniversity.edu.cafe.menu.mgnt.util;

import com.ktdsuniversity.edu.cafe.menu.mgnt.service.MenuMgntService;
import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class ValidationHandler {
	
	/**
	 * 입력한 값이 숫자인지 확인
	 * @param inputValue : scanner로 입력 받은 값
	 * @return true -> 숫자이다. false -> 숫자가 아니다.
	 */
	public boolean checkIsNumber(String inputValue) {
		return isNotNull(inputValue) && isNotEmpty(inputValue) && isNumber(inputValue) && isInteger(inputValue);
	}
	
	/**
	 * 입력한 값이 문자(영어, 한글)인지 확인
	 * @param inputValue : scanner로 입력 받은 값
	 * @return true -> 문자(영어,한글)이다. false -> 문자(영어,한글)이 아니다. (특수문자, 공백, 숫자, ...etc)
	 */
	public boolean checkIsString(String inputValue) {
		return isNotNull(inputValue) && isNotEmpty(inputValue) && isString(inputValue);
	}
	
	/**
	 * 입력한 값이 Y,N 인지 확인
	 * @param inputValue : scanner로 입력 받은 값
	 * @return true -> Y,N이다. false -> Y,N이 아니다. (특수문자, 공백, 숫자, ...etc)
	 */
	public boolean checkIsYN(String inputValue) {
		return checkIsString(inputValue) && isYN(inputValue) && isOneLetter(inputValue);
	}
	
	/**
	 * 값이 이미 존재하는지 확인
	 * @param itemType : 카테고리(커피, 음료, 티, 디저트)
	 * @param itemName : 입력할 값 (ex: itemType이 커피이면 -> 아메리카노 )
	 * @param dataSource : 값을 저장해둔 Map
	 * @return 값이 존재하지 않으면 true, 존재하면 false
	 */
	public boolean isNotExistsValue(int itemType, String itemName, MenuMgntService service) {
		for (MenuMgntVO item : service.readSome(changeItemType(itemType))) {
			if(item.getItemName().equals(itemName)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * itemType 입력이 1,2,3,4인지 확인
	 * @param itemType 사용자가 입력한 itemType 
	 * @return 입력이 1,2,3,4 중 하나이면 true / 그 외 숫자이면 false;
	 */
	public boolean checkItemType(int itemType) {
		if (itemType == 1 || itemType == 2 || itemType == 3 || itemType == 4) {
			return true;
		} 
		return false;
	}

	/**
	 * 입력받은 itemType(숫자)를 문자로 변경하는 메소드
	 * @param itemType 사용자가 입력한 itemType(1,2,3,4)
	 * @return 1,2,3,4 숫자에 맞는 itemType(문자) 1 - 커피 / 2 - 음료 / 3 - 티 / 4 - 디저트
	 */
	public String changeItemType(int itemType) {
		if (itemType == 1) {
			return "커피";
		} else if (itemType == 2) {
			return "음료";
		} else if (itemType == 3) {
			return "티";
		} else if (itemType == 4) {
			return "디저트";
		} else {
			return "없음";
		}
	}
	
	/**
	 * 값이 null이 아닌지 확인
	 * @param value : 값
	 * @return null이 아니면 true, null 이면 false
	 */
	private boolean isNotNull(String value) {
		return value!=null;
	}
	
	/**
	 * 값이 비어 있지 않은지 확인
	 * @param value : 값
	 * @return 값이 있으면 true, 값이 비어있으면 false 
	 */
	private boolean isNotEmpty(String value) {
		return !value.trim().equals("");
	}
	
	/**
	 * 값이 숫자인지 확인(Only 숫자)
	 * @param value : 값
	 * @return 숫자이면 true, 숫자가 아닌 값이 섞여있거나 숫자가 아니면 false
	 */
	private boolean isNumber(String value) {
		return value.matches("^[0-9]+$");
	}
	
	/**
	 * 값이 정수 값 범위 내 인지 확인
	 * @param value : 값
	 * @return 정수 범위 내의 숫자이면 true, 아니면 false
	 */
	private boolean isInteger(String value) {
		int intValue;
		try {
			intValue = Integer.parseInt(value);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * 값이 문자(영어, 한글)인지 확인
	 * @param value : 값
	 * @return 문자(영어, 한글)이면 true, 문자(영어, 한글)가 아닌 값이 섞여있거나 문자(영어, 한글)가 아니면 false
	 */
	private boolean isString(String value) {
		return value.matches("^[a-zA-Z가-힣]+$");
	}
	
	
	/**
	 * 값이 Y or N인지 확인
	 * @param value : 값
	 * @return y와 n으로 구성되어있으면 true, 아닌 값이 섞여있거나 y,n이 아니면 false
	 */
	private boolean isYN(String value) {
		return value.matches("^[yYnN]+$");
	}
	
	/**
	 * 값이 1글자인지 확인
	 * @param value : 값
	 * @return 값이 1글자이면 true , 아니면 false;
	 */
	private boolean isOneLetter(String value) {
		return value.length() == 1;
	}
}
