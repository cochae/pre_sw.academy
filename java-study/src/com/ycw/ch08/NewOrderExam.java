package com.ycw.ch08;

public class NewOrderExam {
	public static void main(String[] args) {
		NewOrder order = new NewOrder("1", "2", "3", "4", false);
		System.out.println("<주문 현황>");
		System.out.println("appetizer: " + order.appetizer());
		System.out.println("maindish: " + order.maindish());
		System.out.println("dessert: " + order.dessert());
		System.out.println("drink: " + order.drink());
		System.out.println("togo: " + order.togo());
		System.out.println("-----------------------------------");
		System.out.println(order);
	}
}
