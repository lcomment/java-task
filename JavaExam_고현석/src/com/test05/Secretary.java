package com.test05;

public class Secretary extends Employee implements Bonus {
	public Secretary() {}
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		this.setSalary(this.getSalary() + pay / 10 * 8);
	}

	@Override
	public double tax() {
		return getSalary() * 0.1;
	}
}
