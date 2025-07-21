package com.ycw.ch08;

public class OrderExam {
	public static void main(String[] args) {
		Order order = new Order();
		order.setAppetizer("soup");
		order.setMaindish("steak");
		order.setDessert("icecream");
		order.setDrink("coke");
		order.setTogo(true);
		
		System.out.println("<주문 현황>");
		System.out.println("appetizer: " + order.getAppetizer());
		System.out.println("maindish: " + order.getMaindish());
		System.out.println("dessert: " + order.getDessert());
		System.out.println("drink: " + order.getDrink());
		System.out.println("togo: " + order.isTogo());
	}
}
