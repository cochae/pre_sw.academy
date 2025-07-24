package com.ycw.ch15.step03;

public class PiggyExam {
	public static void main(String[] args) {
		
		GenericPiggyBank<Integer> intPiggy = new GenericPiggyBank<Integer>();
		
		intPiggy.setMoney(1000);
		System.out.println(intPiggy.getMoney());
		
		GenericPiggyBank<Double> doublePiggy = new GenericPiggyBank<Double>();
		
		doublePiggy.setMoney(50.8);
		System.out.println(doublePiggy.getMoney());
		
//		IntPiggyBank intPiggyBank = new IntPiggyBank();
//		intPiggyBank.setMoney(1000);
//		System.out.println(intPiggyBank.getMoney());
//		
//		DoublePiggyBank doublePiggyBank = new DoublePiggyBank();
//		doublePiggyBank.setMoney(50.4);
//		System.out.println(doublePiggyBank.getMoney());
		
		GenericPiggyBank<Apple> applePiggy = new GenericPiggyBank<Apple>();
		applePiggy.setMoney(new Apple());
		System.out.println(applePiggy.getMoney());
	}
}
