package com.ktdsuniversity.edu.other;

import com.ktdsuniversity.edu.member.MemberService;

public class Main {
	
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		memberService.setUserName("홍길동");
		String userName = memberService.getUserName();
		System.out.println(userName);
		memberService.join();
//		memberService.login();	//private 접근 제한자로 인한 에러 발생
//		memberService.quit();	//default 접근 제한자로 인한 에러 발생
	}
}
