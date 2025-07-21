package com.ycw.ch10_2;

public class Truck extends Car {

	public Truck(String manufacturer) {
		super(manufacturer);
	}
	
	public void connectTrailer() {
		System.out.println("트레일러 연결.");
	}
	public void disconnectTrailer() {
		System.out.println("트레일러 해제.");
	}
}