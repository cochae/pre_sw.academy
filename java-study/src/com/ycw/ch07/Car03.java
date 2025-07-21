package com.ycw.ch07;

public class Car03 {
	String model = "new car";
	String color = "white";
	
	public Car03() {
		
	}

	public Car03(String model) {
		this.model = model;
	}

	public Car03(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving ~~~");
	}
}
