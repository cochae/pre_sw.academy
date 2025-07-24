package com.ycw.ch12.step05;

public class Bird implements Animal{
	
	@Override
	public void sound() {
		System.out.println("짹짹!");
	}

	@Override
	public void eat() {
		System.out.println("모이!");

	}
}
