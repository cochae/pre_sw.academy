package com.ycw.ch07;

public class CalculatorExam {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int num1 = 10, num2 = 20;
		
		System.out.println("num1 + num2 = " + cal.add(num1, num2));
	}
}