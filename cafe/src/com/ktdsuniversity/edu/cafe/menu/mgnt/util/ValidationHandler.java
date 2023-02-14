package com.ktdsuniversity.edu.cafe.menu.mgnt.util;

import java.util.List;
import java.util.Map;

import com.ktdsuniversity.edu.cafe.menu.mgnt.vo.MenuMgntVO;

public class ExceptionHandler {
	
	/**
	 * 입력한 값이 숫자인지 확인
	 * @param inputValue : scanner로 입력 받은 값
	 * @return true -> 숫자이다. false -> 숫자가 아니다.
	 */
	public boolean checkIsNumber(String inputValue) {
		return isNotNull(inputValue) && isNotEmpty(inputValue) && isNumber(inputValue);
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
	 * 값이 null이 아닌지 확인
	 * @param value : 값
	 * @return null이 아니면 true, null 이면 false
	 */
	public boolean isNotNull(String value) {
		return value!=null;
	}
	
	/**
	 * 값이 비어 있지 않은지 확인
	 * @param value : 값
	 * @return 값이 있으면 true, 값이 비어있으면 false 
	 */
	public boolean isNotEmpty(String value) {
		return !value.trim().equals("");
	}
	
	/**
	 * 값이 숫자인지 확인(Only 숫자)
	 * @param value : 값
	 * @return 숫자이면 true, 숫자가 아닌 값이 섞여있거나 숫자가 아니면 false
	 */
	public boolean isNumber(String value) {
		return value.matches("^[0-9]*$");
	}
	
	/**
	 * 값이 값이 문자(영어, 한글)인지 확인
	 * @param value : 값
	 * @return 문자(영어, 한글)이면 true, 문자(영어, 한글)가 아닌 값이 섞여있거나 문자(영어, 한글)가 아니면 false
	 */
	public boolean isString(String value) {
		return value.matches("^[a-zA-Z가-힣]*$");
	}
	
	/**
	 * 값이 이미 존재하는지 확인
	 * @param itemType : 카테고리(커피, 음료, 티, 디저트)
	 * @param itemName : 입력할 값 (ex: itemType이 커피이면 -> 아메리카노 )
	 * @param dataSource : 값을 저장해둔 Map
	 * @return 값이 존재하지 않으면 true, 존재하면 false
	 */
	public boolean isNotExistsValue(String itemType, String itemName, Map<String, List<MenuMgntVO>> dataSource) {
		for(int i=0;i<dataSource.get(itemType).size();i++) {
			if(dataSource.get(itemType).get(i).getItemName().equals(itemName)) {
				return false;
			}
		}
		return true;
	}
}
