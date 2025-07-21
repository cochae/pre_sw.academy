package com.ycw.ch05;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[] scores = {100, 90, 85};
		
		for (int element : scores) {
			System.out.println(element);
		}
		
		int sum;
		int[][] termScores = { { 90, 95, 80}, { 95, 100, 75 } };
		
		for (int[] row : termScores) {
			sum = 0;
			for ( int score : row ) {
				System.out.println(score + " ");
				sum += score;
			}
			System.out.println("평균: " + ((double)sum / row.length));
		}
	}

}
