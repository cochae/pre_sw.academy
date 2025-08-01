package com.ycw.ch11.step02;

public class CarExam {
	public static void main(String[] args) {
		Car mustang = new Convertible("현대", "yellow");
		Car truck = new Truck("현대");
		
		System.out.println(mustang.getManufacturer());
		System.out.println(truck.getManufacturer());
		
//		mustang.openRoof(); // 접근이 안됨
//		truck.connectTrailer();
		mustang.drive();
		truck.drive();
		
		//자식(자신) 메서드 접근이 필요할 때 수동 형변환
//		Convertible myCar = (Convertible)mustang;
//		Truck yourCar = (Truck)truck;
//		myCar.openRoof();
//		yourCar.connectTrailer();
		
//		Truck t = (Truck)mustang;
//		Convertible c = (Convertible)truck;
		
//		t.connectTrailer();
//		c.openRoof();
		
		// 타입 검사
		if (mustang instanceof Truck) {
			Truck t = (Truck)mustang;
			t.connectTrailer();
		} else {
			Convertible c = (Convertible)mustang;
			c.openRoof();
		}
	}
}