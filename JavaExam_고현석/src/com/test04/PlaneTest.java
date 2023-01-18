package com.test04;

public class PlaneTest {

	public static void main(String[] args) {
		Airplane a = new Airplane("L777", 1000);
		Cargoplane c = new Cargoplane("C50", 1000);

		print(a, c);
		
		System.out.println("100 운항");
		a.flight(100);
		c.flight(100);
		print(a, c);
		
		System.out.println("200 주유");
		a.refuel(200);
		c.refuel(200);
		print(a, c);
	}
	
	private static void print(Airplane a, Cargoplane c) {
		System.out.println("Plane fuelSize\r\n"
				+ "--------------------");
		System.out.println(a);
		System.out.println(c);
		System.out.println();
	}
}
