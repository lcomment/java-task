package com.test04;

public class Cargoplane extends Plane {
	public Cargoplane() {}
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int remain = this.getFuelSize() - (distance / 10 * 50);
		
		this.setFuelSize(remain <= 0 ? 0 : remain);
	}
}
