package com.ycw.ch14.step05;

public class Guest01 extends Thread{
	private VendingMachine machine;

	public void setMachine(VendingMachine machine) {
		this.machine = machine;
		this.setName("Guest01");
	}

	@Override
	public void run() {
		machine.setOrder("탄산수");
	}
	
}
