package com.ycw.ch10;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		Convertible mustang = new Convertible("red");
		Truck truck = new Truck();
		
		car.drive();
		mustang.openRoof();
		mustang.drive();
		truck.connectTrailer();
		truck.drive();
	}
}
