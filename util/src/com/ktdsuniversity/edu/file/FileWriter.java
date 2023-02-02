package com.ktdsuniversity.edu.file;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriter {
	
	public static File createNewFile() throws IOException {
		File textFile = new File("C:\\logsaaa", "test.txt");
		textFile.createNewFile();
		return textFile;
	}
	
	public static File createNewFileThrowsRuntimeException() {
		File textFile = new File("C:\\logsss", "test.txt");
		try {
			textFile.createNewFile();
		} catch (IOException ioe) {
			throw new RuntimeException(ioe.getMessage(), ioe);
		}
		return textFile;
	}
	public static void main(String[] args){
		
//		File textFile = new File("C:\\logs","test.txt");
		File textFile = new File("C:\\logs");
//		if(textFile.exists() && textFile.isFile()) {
		if(textFile.isDirectory()) {
			OutputStream fos = null;
			try {
				fos = new FileOutputStream(textFile);
				fos.write("파일 내용을 씁니다..".getBytes());
				fos.flush();
			} catch (IOException e) {
//				e.printStackTrace();
			} finally {
				if(fos != null) {
					try {
						fos.close();
					} catch (IOException e) {}	//catch 해도 처리할 방법이 없다.
				}
			}
		}
		/*
		createNewFileThrowsRuntimeException();
		try{
			createNewFile();
		}catch (IOException ioe){
			System.out.println("에러가 발생했습니다."+ioe.getMessage());
		}
		*/
	}
}
