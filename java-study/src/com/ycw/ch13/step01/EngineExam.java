package com.ycw.ch13.step01;


public class EngineExam {
	public static void main(String[] args) {
//		Engine gas = new GasolineEngine();
//		Engine diesel = new DieselEngine();
		
		Engine gas = new Engine() {
			
			public void runEngine() {
				System.out.println("부르릉~~!!");
			}
		};
		
		
		Engine diesel = new Engine() {
			
			public void runEngine() {
				System.out.println("부릉!!!!!!!!!!!");
			}
		};
		
		
		SUV santafe = new SUV(gas);
		SUV sorento = new SUV(diesel);
		
		santafe.drive();
		sorento.drive();
	}
}
