package com.ycw.ch07;

public class Car {
	String model = "new car";
	String color = "white";
	
//	public Car(String inputModel, String inputColor) {
//		model = inputModel;
//		color = inputColor;
//	}
	
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving ~~~");
	}
	//자동 생성 시에 부모가 없는데도 super();가 생김
	//자바는 부모를 지정하지 않으면 자동으로 object를 부모로 지정함
	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
}
