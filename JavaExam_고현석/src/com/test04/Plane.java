package com.test04;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {}
	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		this.fuelSize += fuel;
	}
	public abstract void flight(int distance);
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public int getFuelSize() {
		return fuelSize;
	}
	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	@Override
	public String toString() {
		return planeName + " " + fuelSize;
	}
}
