package com.ycw.ch14.step04;

public class VendingExam {
	public static void main(String[] args) {
		VendingMachine machine = new VendingMachine();
		
		Guest01 guest01 = new Guest01();
		guest01.setMachine(machine);
		guest01.start();
		
		Guest02 guest02 = new Guest02();
		guest02.setMachine(machine);
		guest02.start();
		
	}
}
