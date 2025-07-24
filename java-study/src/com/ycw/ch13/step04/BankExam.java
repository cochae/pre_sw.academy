package com.ycw.ch13.step04;

public class BankExam {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		account.deposit(10000);
		System.out.println("잔액: " +  account.getBalance());
		try {
			account.withdraw(15000);
			System.out.println("잔액: " + account.getBalance());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
