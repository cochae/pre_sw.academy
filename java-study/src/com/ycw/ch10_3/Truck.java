package com.ycw.ch10_3;

public class Truck extends Car{

	public Truck(String manufacturer) {
		super(manufacturer);
	}
	public void drive() {
		System.out.println(getManufacturer() + " 트레일러 트럭 : 부르릉~~~");
	}
	
	public void connectTrailer() {
		System.out.println("트레일러 연결.");
	}
	public void disconnectTrailer() {
		System.out.println("트레일러 해제.");
	}
	
}
