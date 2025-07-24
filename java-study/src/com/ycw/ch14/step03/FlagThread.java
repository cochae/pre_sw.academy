package com.ycw.ch14.step03;

public class FlagThread extends Thread{

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
	
}
