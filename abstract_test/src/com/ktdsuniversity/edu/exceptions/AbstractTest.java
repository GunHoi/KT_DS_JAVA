package com.ktdsuniversity.edu.exceptions;

public abstract class AbstractTest {
	public void select() {
		connection();
		handler();
		close();
	}
	protected abstract void handler();
	private void connection() {
		System.out.println("연결");
	}
	private void close() {
		System.out.println("종료");
	}
}
