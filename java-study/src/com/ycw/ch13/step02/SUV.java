package com.ycw.ch13.step02;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}