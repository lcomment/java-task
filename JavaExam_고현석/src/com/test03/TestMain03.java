package com.test03;

import java.util.*;

public class TestMain03 {
	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		StringTokenizer st = new StringTokenizer(str, ",");
		List<Double> list = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			list.add(Double.parseDouble(st.nextToken()));
		}
		double sum = 0;
		
		for(double d : list) {
			sum += d;
		}
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + sum / (double)list.size());
	}
}
