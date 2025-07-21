package com.ycw.ch11.step01;

public class SUVd {
	private DieselEngine dEngine;

	public SUVd(DieselEngine dEngine) {
		this.dEngine = dEngine;
	}
	
	public void drive() {
		dEngine.runEngine();
	}
}