package com.ycw.ch18.step05;

public class SingletonExam {
	public static void main(String[] args) {
		Singleton hello = Singleton.INSTANCE;
		hello.sayHello();
	}
}
