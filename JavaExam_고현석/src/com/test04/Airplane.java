package com.test04;

public class Airplane extends Plane {
	public Airplane() {}
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	@Override
	public void flight(int distance) {
		int remain = this.getFuelSize() - (distance / 10 * 30);
		
		this.setFuelSize(remain <= 0 ? 0 : remain);
	}
}
