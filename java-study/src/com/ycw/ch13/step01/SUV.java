package com.ycw.ch13.step01;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}