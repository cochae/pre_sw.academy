package com.ycw.ch12.step05;


public class AnimalExam {

	public static void main(String[] args) {
		Animal puppy = new Dog();
		Animal sparrow = new Bird();
		
		puppy.sound();
		sparrow.sound();
		puppy.eat();
		sparrow.eat();
	}
}
