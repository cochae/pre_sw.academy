package com.ycw.ch15.step02;

public class GenericPiggyBank<T> {
	private T money;

	public T getMoney() {
		return money;
	}

	public void setMoney(T money) {
		this.money = money;
	}
}