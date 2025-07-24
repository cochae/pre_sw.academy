package com.ycw.ch14.step06;

public class Guest02 extends Thread{
	private VendingMachine machine;

	public void setMachine(VendingMachine machine) {
		this.machine = machine;
		this.setName("Guest02");
	}

	@Override
	public void run() {
		machine.setOrder("펩시제로");
	}
	
}
