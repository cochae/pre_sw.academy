package com.ycw.ch13.step04;

public class TryFinallyTest {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		
		try {
			System.out.println("numbers[4]: " + numbers[4]);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally {
			System.out.println("항상 실행");
		}
	}
}