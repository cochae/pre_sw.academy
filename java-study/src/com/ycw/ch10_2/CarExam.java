package com.ycw.ch10_2;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car("현대");
				
		Convertible mustang = new Convertible("현대", "red");
		
		Truck truck = new Truck("현대");
		
		car.drive();
		mustang.openRoof();
		truck.connectTrailer();
		System.out.println(car.toString());
		System.out.println(mustang.toString());
	}

}
