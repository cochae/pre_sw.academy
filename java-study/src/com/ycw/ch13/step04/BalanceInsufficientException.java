package com.ycw.ch13.step04;

//exception class 이름만 봐도 어떤 예외인지 제 3자가 바로 알 수 있게끔 만드는 것이 좋음
public class BalanceInsufficientException extends RuntimeException {

	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
