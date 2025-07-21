package com.ycw.ch08;

public class Order {
	private String appetizer;
	private String maindish;
	private String dessert;
	private String drink;
	private boolean togo;
	
	public String getAppetizer() {
		return appetizer;
	}
	public void setAppetizer(String appetizer) {
		this.appetizer = appetizer;
	}
	public String getMaindish() {
		return maindish;
	}
	public void setMaindish(String maindish) {
		this.maindish = maindish;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	public boolean isTogo() {
		return togo;
	}
	public void setTogo(boolean togo) {
		this.togo = togo;
	}
}
