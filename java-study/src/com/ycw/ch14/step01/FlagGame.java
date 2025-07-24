package com.ycw.ch14.step01;

public class FlagGame {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			System.out.println("청기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	
		for(int i = 0; i < 10; i++) {
			System.out.println("백기");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
