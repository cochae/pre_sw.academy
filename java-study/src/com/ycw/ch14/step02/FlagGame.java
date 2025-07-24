package com.ycw.ch14.step02;

public class FlagGame {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {

				for(int i = 0; i < 10; i++) {
					System.out.println("백기");
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
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
