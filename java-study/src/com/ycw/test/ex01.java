package com.ycw.test;

public class ex01 {
	public static void main(String[] args) {
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		if(Double.isNaN(z)) {
			System.out.println("error");
		}
		else {
			double result = z + 10;
			System.out.println("결과: " + result);
		}
	}
}
