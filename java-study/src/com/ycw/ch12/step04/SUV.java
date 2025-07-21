package com.ycw.ch12.step04;

public class SUV {
	private Engine engine;

	public SUV(Engine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		engine.runEngine();
	}
}