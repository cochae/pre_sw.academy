package com.ycw.ch09;

import com.ycw.ch08.CoffeeMachine;

public class ImportExam {

	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();
		
		machine.makeCoffee();
		System.out.println(machine.getProduction());
	}

}
