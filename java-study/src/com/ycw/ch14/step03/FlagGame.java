package com.ycw.ch14.step03;

public class FlagGame {

	public static void main(String[] args) {
		Thread thread = new FlagThread();
		thread.start();

		for(int i = 0; i < 10; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}
