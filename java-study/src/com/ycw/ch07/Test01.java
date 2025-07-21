package com.ycw.ch07;

public class Test01 {
	public static void main(String[] args) {
		double[][]findAvgInput={{5,4.5,6.8},
								{6,0,3.4}
								,{7,8.4,2.3}};
		findAverage(findAvgInput, 0);
	}
	public static void findAverage(double[][] array, double a) {
		double sum = 0.0;
		int real_i = 0;
		int real_j = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == a) {
					real_i = i;
				}
			}
		}
		for(int i = 0; i < 3; i++) {
			sum += array[real_i][i];
			double avg = sum / 3.0;
			if(array[real_i][real_j] > avg) {
				array[real_i][real_j] = avg;
			}
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}
}

//public static void findAverage(double[][] array) {
//
//	for(int row = 0; row < array.length; row++){
//		for (int column = 0; column < array[row].length; column++) {
//			if (array[row][column] == 0) {
//				array[row][column] = Math.max(getRowTotal(array, row) / array[row].length,
//						getColumnTotal(array, column) / array.length);
//			}
//		}
//	}
//	for (double[] row : array) {
//		for (double column : row) {
//			System.out.printf("%2.1f  ", column);
//		}
//		System.out.println();
//	}
//}
//
//public static double getRowTotal(double[][] array, int row) {
//	double sum = 0.0;
//	for (int column = 0; column < array[row].length; column++) {
//		sum += array[row][column];
//	}
//	return sum;
//}
//
//public static double getColumnTotal(double[][] array, int column) {
//	double sum = 0.0;
//	for(int row = 0; row<array.length; row++){
//		sum += array[row][column];
//	}
//	return sum;
//}