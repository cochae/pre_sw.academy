package com.ycw.ch14.step04;

public class VendingMachine {
	private String order;
	
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
	}
		System.out.println(Thread.currentThread().getName() + "ordered " + getOrder());
	}
}
