package com.ycw.stack;

public class CalcExam {

	public static void main(String[] args) {
		StackCalculator calc = new StackCalculator("(1+2)*(3/4)+(5+(6-7))");
		
		System.out.println(calc.solve());
		
	}

}
