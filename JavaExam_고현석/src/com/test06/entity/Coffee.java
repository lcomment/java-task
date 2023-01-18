package com.test06.entity;

public class Coffee extends Drink {
	public static int COFFEE_PRICE = 100;
	
	public Coffee() {
		super(COFFEE_PRICE);
	}

	@Override
	public String toString() {
		return "커피\t\t" + COFFEE_PRICE + "원";
	};
}
