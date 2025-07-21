package com.ycw.ch08;

public class CoffeeExam {
	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();
		
		//접근 차단
		//machine.sugar = 10;
		machine.makeCoffee();
		machine.addShot(1);
		machine.addShot(100);
		machine.addSugar(100);
		System.out.println(machine.getProduction());
	}
}
