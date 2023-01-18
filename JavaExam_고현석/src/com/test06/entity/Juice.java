package com.test06.entity;

public class Juice extends Drink {
	public static int JUICE_PRICE = 200;
	
	public Juice() {
		super(JUICE_PRICE);
	}

	@Override
	public String toString() {
		return "쥬스\t\t" + JUICE_PRICE + "원";
	};
}
