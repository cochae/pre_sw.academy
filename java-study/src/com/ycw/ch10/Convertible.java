package com.ycw.ch10;

public class Convertible extends Car {
	
	private String color;

	public Convertible(String color) {
		this.color = color;
	}

	public void openRoof() {
		System.out.println("뚜껑 연다.");
	}
	public void closeRoof() {
		System.out.println("뚜껑 닫는다.");
	}
}
