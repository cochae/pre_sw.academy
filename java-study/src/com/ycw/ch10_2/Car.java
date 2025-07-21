package com.ycw.ch10_2;

public class Car {
	private String manufacturer;

	public Car(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void drive() { 
		System.out.println("달린다.");
	}
	
	public void stop() {
		System.out.println("멈춘다.");
	}
	
	public String getManufacturer() {
		return manufacturer;
	}

}
