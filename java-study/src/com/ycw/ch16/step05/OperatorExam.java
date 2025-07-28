package com.ycw.ch16.step05;

import java.util.function.IntBinaryOperator;

public class OperatorExam {
	public static int getMinMax(IntBinaryOperator operator, int[] array) {
		int result = array[0];
		for(int num : array) {
			result = operator.applyAsInt(result, num);
		}
		return result;
	}	
	
	public static void main(String[] args) {
		int[] scores = {82, 96, 86, 97, 100, 91, 89, 93};
		IntBinaryOperator op = (x, y) -> { if(x >= y) return x; else return y;};
		int max = getMinMax(op, scores);
		System.out.println("Max: " + max);
	}
}
