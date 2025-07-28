package com.ycw.ch18.step05;

public enum TrafficLight {
	RED("정지"), GREEN("직진"), ARROW("좌회전");
	private String command;
	
	private TrafficLight() {
		
	}
	private TrafficLight(String command) {
		this.command = command;
	}
	public String getCommand() {
		return command;
	}
}
