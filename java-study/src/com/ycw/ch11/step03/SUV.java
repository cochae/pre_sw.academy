package com.ycw.ch11.step03;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}