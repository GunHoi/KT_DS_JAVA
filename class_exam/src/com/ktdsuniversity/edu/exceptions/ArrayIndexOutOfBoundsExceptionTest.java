package com.ktdsuniversity.edu.exceptions;

public class ArrayIndexOutOfBoundsExceptionTest {
	
	public static void main(String[] args) {
		
		String[] nameArr = new String[3];
		nameArr[0] = "김모씨";
		nameArr[1] = "이모씨";
		nameArr[2] = "박모씨";
		
		String name = nameArr[0];
		System.out.println(name);
		name = nameArr[1];
		System.out.println(name);
		name = nameArr[2];
		System.out.println(name);
		
		if(nameArr.length > 3) {
			name = nameArr[3];
			System.out.println(name);
		}
		
		String string = "Amazon Web Services는 다양한 분야에 걸쳐 여러 플랫폼과 다양한 서비스를 제공한다.\r\n"
				+ "한대의 독립된 컴퓨터를 제공하고 있는 EC2, 데이터베이스 서버인 RDS, 파일 서버 S3 등 다양한 서비스로 이루어져 있으며, 이렇게 제공되는 서비스들을 조합하여 하나의 Web 서비스를 만들게 되는 것이다.";
		
		String[] wordArray = string.split(" ");
		if (wordArray.length > 50) {
			System.out.println(wordArray[50]);
		}
		
		try {
			System.out.println(wordArray[50]);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
	}
}
