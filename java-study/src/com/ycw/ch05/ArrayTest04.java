package com.ycw.ch05;

public class ArrayTest04 {
	public static void main(String[] args) {
		int sales[] = { 52, 62, 30, 95, 77, 0, 100 };
		char graph[][] = new char[10][7];
		
		int[] sales_cnt = new int[7];
		for(int i = 0; i < sales_cnt.length; i++) {
			sales_cnt[i] = sales[i] / 10;
		}
		
		for(int i = 0; i < graph.length; i++) {
			for(int j = 0; j < graph[0].length; j++) {
				graph[i][j] = 'o';
			}
		} 
		for(int i = 0; i < sales.length; i++) {
			for(int j = 10 - sales_cnt[i]; j < 10; j++) {
				graph[j][i] = '•';
			}
		}     

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}
	}
}
