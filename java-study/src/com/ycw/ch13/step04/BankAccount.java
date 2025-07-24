package com.ycw.ch13.step04;

public class BankAccount {
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) {
		if(balance < money) {
			throw new BalanceInsufficientException("잔액 부족!");
		}
		balance -= money;
	}
}
