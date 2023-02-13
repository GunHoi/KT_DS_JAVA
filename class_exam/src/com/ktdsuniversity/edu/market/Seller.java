package com.ktdsuniversity.edu.market;

public class Seller {
	
	private String name;
	private int money;
	private int stock;
	
	public Seller(String name, int money, int stock) {
		this.name = name;
		this.money = money;
		this.stock = stock;
	}
	
	public void sell(int orderCnt) {
		this.money += orderCnt * 1000;
		this.stock -= orderCnt;
	}
}
