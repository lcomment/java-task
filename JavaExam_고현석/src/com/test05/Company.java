package com.test05;

import java.util.HashMap;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer, Employee> map = new HashMap<>();
		
		Secretary s1 = new Secretary("홍길동", 1, "Secretary", 800);
		Sales s2 = new Sales("이순신", 2, "Sales", 1200);
		map.put(s1.getNumber(), s1);
		map.put(s2.getNumber(), s2);
		
		
		System.out.println("name\tdepartment\tsalary\r\n"
				+ "------------------------------------------");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("\n인센티브 100지급\n");
		s1.incentive(100);
		s2.incentive(100);
		
		System.out.println("name\tdepartment\tsalary\ttax\r\n"
				+ "------------------------------------------");
		System.out.println(s1 + "\t" + s1.tax());
		System.out.println(s2 + "\t" + s2.tax());
	}
	private static void print(HashMap<Integer, Employee> map) {
		
		
	}
}
