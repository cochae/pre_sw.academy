package com.ycw.ch12.step05;


public class Dog implements Animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍!");
	}

	@Override
	public void eat() {
		System.out.println("뇸뇸!");
	}

}
