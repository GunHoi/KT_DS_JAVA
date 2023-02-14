package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class NullPointerExceptionTest {
	
	public static String getName(int nameLength) {
		
		if(nameLength == 2) {
			return "두자";
		} else if (nameLength == 3){
			return "3글자";
		} else if (nameLength == 4) {
			return "4글자명";
		}
		
		return null;
	}
	
	public static String nullToDefault(String string, String defaultValue) {
		return string == null ? defaultValue : string;
	}
	
	public static String nullToEmpty(String string) {
		return string == null ? "" : string;
	}
	
	
	public static void main(String[] args) {
		
		String name = getName(6);
		if(name == null) {
			name = "";
		}
		boolean isAStart = name.startsWith("A");
		System.out.println(isAStart);
		
		Map<String, String> nameMap = new HashMap<>();
		nameMap.put("김", "김모씨");
		nameMap.put("이", "이모씨");
		nameMap.put("박", "박모씨");
		nameMap.put("최", "");
		
		String fullName = null;
		if(nameMap.containsKey("최") && nameMap.get("최").length() > 0) {
			fullName = nameMap.get("최");
			String lastName = fullName.substring(0, 1);
			System.out.println(lastName);
		}
		//Map에 존재하지 않는 item을 get하면 null이 오게 된다.
		
		fullName = nullToEmpty(nameMap.get("최"));
		if (fullName.length() > 0) {
			String lastName = fullName.substring(0, 1);
			System.out.println(lastName);
		} else {
			System.out.println("데이터가 없습니다.");
		}
		
	}
}
