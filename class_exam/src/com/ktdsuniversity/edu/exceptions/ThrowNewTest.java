package com.ktdsuniversity.edu.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ThrowNewTest {
	
	static Map<String, String> memberMap = new HashMap<>();
	
	public static boolean isCreate(String memberID) {
		
		if(memberMap.containsKey(memberID)) {
//			RuntimeException memberIDException = new DuplicateMemberIDException(memberID);
//			throw memberIDException;
			throw new DuplicateMemberIDException(memberID);
			//throw new RuntimeException("이미 가입된 ID 입니다.");
		}
		
		memberMap.put(memberID, "생성" + memberID);
		return memberMap.containsKey(memberID);
	}
	
	public static void main(String[] args) {
		boolean isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		isCreate = isCreate("ktds0601");
		System.out.println(isCreate);
		
		System.out.println("회원 가입이 완료되었습니다.");
	}
}
