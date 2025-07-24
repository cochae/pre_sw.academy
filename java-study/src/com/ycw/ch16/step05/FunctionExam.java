package com.ycw.ch16.step05;

import java.util.function.Function;

public class FunctionExam {
	public static void main(String[] args) {
		BestRobbins41 br = new BestRobbins41("strawberry", "mango", "chocolate",
				"mint", "cherry", "banana");
		
		Function<BestRobbins41, String> tom = f -> f.getPint();
		Function<BestRobbins41, String> kate = f -> f.getQuater();
		
		System.out.println("Tom's choice- " + tom.apply(br));
		System.out.println("Kate's choice- " + kate.apply(br));
	}
	

}
