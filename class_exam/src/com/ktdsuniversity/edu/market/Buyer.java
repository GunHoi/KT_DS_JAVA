package com.ktdsuniversity.edu.market;

public class Buyer {
	
	private String name;
	private int money;
	private int stock;
	
	public Buyer(String name, int money, int stock) {
		this.name = name;
		this.money = money;
		this.stock = stock;
	}
	
	public void buy(Seller seller, int orderCnt) {
		this.money -= orderCnt * 1000;
		this.stock += orderCnt;
		seller.sell(orderCnt);
	}
}
