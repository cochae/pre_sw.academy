package com.ycw.ch16.step03;

public class LambdaExam {
	public static void main(String[] args) {
		ArgReturn lambda = (x, y) -> {
			int sum = x + y;
			return sum;
		};
		System.out.println(lambda.test(1,  2));
	}
}
