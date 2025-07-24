package com.ycw.ch12.step05;

public interface Animal {
	
	//final static
	String name = "동물";
	
	//abstract가 생략됐다고 봐야 함
	public void sound();
	public default void eat() {
		System.out.println("먹다");
	}
}
