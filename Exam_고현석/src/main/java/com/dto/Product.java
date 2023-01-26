package com.dto;

public class Product {
	private String name;
	private String id;
	private int amount;
	
	public Product(String id, String name, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}	
}
