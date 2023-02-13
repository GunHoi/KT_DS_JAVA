package com.ktdsuniversity.edu.market;

public class Main {
	
	public static void main(String[] args) {
								//이름, 돈, 사과 개수
		Buyer buyer = new Buyer("홍길동",5_000_000, 0);
		Seller seller = new Seller("구매자",10_000_000, 10);
		
				//판매자에게 5개를 산다.
		buyer.buy(seller, 5);
	}
}
