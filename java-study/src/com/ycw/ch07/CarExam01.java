package com.ycw.ch07;

public class CarExam01 {
	public static void main(String[] args) {
		Car myCar = new Car("sedan", "black");
		Car02 yourCar = new Car02("SUV", "blue");
		
		myCar.drive();
		yourCar.drive();
		yourCar.printThis();
	}
}
