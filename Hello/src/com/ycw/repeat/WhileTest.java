package com.ycw.repeat;

public class WhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		while(i <= 100) {
			sum += 1;
			i++;
		}
		System.out.println("1~100 까지의 합: " + sum);
	}
}
