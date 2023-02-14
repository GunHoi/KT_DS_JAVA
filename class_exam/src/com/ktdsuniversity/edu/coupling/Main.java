package com.ktdsuniversity.edu.coupling;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<>();
		Iterable<String> iterable = new ArrayList<>();
		
//		MemberService service = new MemberService();
//		MemberService service1 = new MemberManagement(); 		// Error
		MemberManagement service = new MemberService();
//		MemberManagement service = new EmployeeService();
		
		service.regist();
		service.unregist();
		service.updateMyInfo();
	}
}
