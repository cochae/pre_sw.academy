package com.ycw.ch11.step01;

public class EngineExam {
	public static void main(String[] args) {
		GasolineEngine engine = new GasolineEngine();
		SUV santafe = new SUV(engine);
		
		santafe.drive();
		
		DieselEngine dEngine = new DieselEngine();
		SUVd santafeDiesel = new SUVd(dEngine);
		
		santafeDiesel.drive();
	}
}