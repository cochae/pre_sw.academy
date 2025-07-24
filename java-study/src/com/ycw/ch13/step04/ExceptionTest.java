package com.ycw.ch13.step04;

public class ExceptionTest {
	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("java.lang.String2");
		}catch (ClassNotFoundException e) {
			System.out.println("java.lang.String2: 클래스가 없습니다.");
		}
	}
}