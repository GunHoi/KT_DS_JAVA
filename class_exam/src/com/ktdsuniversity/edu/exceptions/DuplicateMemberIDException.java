package com.ktdsuniversity.edu.exceptions;

public class DuplicateMemberIDException extends RuntimeException {
	
	private static final long serialVersionUID = 300748820639462251L;
	
	// 사용자 예외는 필요에 따라 생성자를 Overriding 한다.
	public DuplicateMemberIDException(String memberID) {
		super(memberID);
	}
	
}
