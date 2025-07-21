package com.ycw.ch09;

public class RobotExam {

	public static void main(String[] args) {
		Robot robot01 = new Robot("robot-01", "helper");
		Robot robot02 = new Robot("robot-02", "guard");
		Robot robot03 = new Robot("robot-03", "assistance");
		
		System.out.println(robot01.getName());
		System.out.println(robot02.getName());
		System.out.println(robot03.getName());
		
		System.out.println("Number of Robots: " + Robot.getPopulation());
		
		//population이 static이기 때문에 누적되는 값으로 출력됨
	}

}
