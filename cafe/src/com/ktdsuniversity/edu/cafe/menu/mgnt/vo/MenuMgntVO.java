package com.ktdsuniversity.edu.cafe.menu.mgnt.vo;

public class MenuMgntVO {
	/**
	 * 아이템명
	 */
	private String itemName;
	
	/**
	 * 아이템 가격
	 */
	private int price;
	
	/**
	 * 아이템 수량
	 */
	private int quantity;
	
	/**
	 * 품절 여부
	 */
	private boolean soldOut;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isSoldOut() {
		return soldOut;
	}

	public void setSoldOut(boolean soldOut) {
		this.soldOut = soldOut;
	}
	
}
