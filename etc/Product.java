package com.doosan.test.prac;

public class Product {

	private int amount;

	public String name;
	
	public String getName() {
		return name;
	}


	public void setIName(String itemName) {
		this.name = itemName;
	}


	public int getAmount() {
		return amount;
	}
	

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Product(int amount, String name) {
		this.amount = amount;
		this.name = name;
	}
}
