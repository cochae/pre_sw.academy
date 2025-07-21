package com.ycw.ch11.step02;

public class Convertible extends Car {
	private String color;
	
	public Convertible(String manufacturer, String color) {
		super(manufacturer); // 가장 첫줄에 선언해야 함.
		this.color = color;
	}

	public void openRoof() {
		System.out.println("뚜껑 연다.");
	}
	
	public void closeRoof() {
		System.out.println("뚜껑 닫는다.");
	}
	
	@Override
	public void drive() {
		System.out.println(getManufacturer() + " " +  color + " convertible driving!");
	}
	
}