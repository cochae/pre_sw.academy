package com.ycw.ch11.step01;

public class SUV {
	private GasolineEngine engine;

	public SUV(GasolineEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}