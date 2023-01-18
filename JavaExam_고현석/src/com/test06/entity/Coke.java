package com.test06.entity;

public class Coke extends Drink {
	public static int COKE_PRICE = 50;
	
	public Coke() {
		super(COKE_PRICE);
	}

	@Override
	public String toString() {
		return "코크\t\t" + COKE_PRICE + "원";
	};
}
