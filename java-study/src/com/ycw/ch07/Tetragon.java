package com.ycw.ch07;

public class Tetragon {
	public int getSquareArea(int x) {
		return x * x;
	}
	public int getSquareArea(int x, int y) {
		return x * y;
	}
	public int getSquareArea(int x, double y) {
		return x * (int)y;
	}
	//반환 타입은 메서드를 구분하는 데 사용되지 않음
//	public double getSquareArea(int x, int y) {
//		return (double)(x * y);
//	}
	
	
}
