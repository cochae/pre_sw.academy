package com.ycw.ch16.step04;

public class FlagGame{
	public static void main(String[] args) {
		//Thread Class에 Runnable이라는 인터페이스 존재
		Thread thread = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				System.out.println("백기");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}
			}
		});

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
