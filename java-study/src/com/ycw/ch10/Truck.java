package com.ycw.ch10;

public class Truck extends Car {
	public void connectTrailer() {
		System.out.println("트레일러 연결");
	}
	public void disconnectTrailer() {
		System.out.println("트레일러 해제.");
	}
}