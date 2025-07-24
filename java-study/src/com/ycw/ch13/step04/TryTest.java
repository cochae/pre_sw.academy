package com.ycw.ch13.step04;

public class TryTest {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println("s의 길이: " + s.length());
	
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("문자열 변수 s가 null입니다");
			e.printStackTrace();
		}
	}

}
