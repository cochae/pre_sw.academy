package com.ycw.ch16.step02;

public class LambdaExam {

	public static void main(String[] args) {
		ArgNoReturn lambda = (x) -> {
			int result = x * 2;
			System.out.println(result);
		};
		lambda.test(10);
	}

}
