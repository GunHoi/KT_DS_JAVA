package com.ktdsuniversity.edu.recursive;

import java.io.File;

public class Recursive {
	
	public void recursive() {
		System.out.println("실행중...");
		recursive();
	}
	
	
	public void readFile(File file) {
		File[] fileArray = file.listFiles();
		
		for (File fileItem : fileArray) {
			System.out.println(fileItem.getName());
			if(fileItem.isDirectory()) {
				readFile(fileItem);
			}
		}

	}
	
	public static void main(String[] args) {
		Recursive recursive = new Recursive();
//		recursive.recursive();
		
		recursive.readFile(new File("C:\\Devs"));
	}
}