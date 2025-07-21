package com.ycw.repeat;

public class DoWhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 1;
		
		do {
			sum += i;
			i++;
		}while(i<=100);
		System.out.println("1~100 까지의 합: " + sum);
	}
}
