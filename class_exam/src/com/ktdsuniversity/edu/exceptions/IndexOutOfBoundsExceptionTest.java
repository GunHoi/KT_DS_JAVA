package com.ktdsuniversity.edu.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOutOfBoundsExceptionTest {
	
	public static void main(String[] args) {
		String string = "Amazon Web Services는 다양한 분야에 걸쳐 여러 플랫폼과 다양한 서비스를 제공한다.\r\n"
				+ "한대의 독립된 컴퓨터를 제공하고 있는 EC2, 데이터베이스 서버인 RDS, 파일 서버 S3 등 다양한 서비스로 이루어져 있으며, 이렇게 제공되는 서비스들을 조합하여 하나의 Web 서비스를 만들게 되는 것이다.";
		
		List<String> wordList = new ArrayList<>();
		wordList.addAll(Arrays.asList(string.split(" ")));
		if(wordList.size() > 50) {
			String word = wordList.get(50);
			System.out.println(word);
		}
		
		try {
			String word = wordList.get(50);
			System.out.println(word);
		} catch (IndexOutOfBoundsException ioobe) {
			System.out.println("그런 인덱스는 없습니다.");
		}
	}
}
