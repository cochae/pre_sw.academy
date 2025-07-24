package com.ycw.ch16.step05;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExam {

	public static void main(String[] args) {
		Consumer<Integer> square = a -> System.out.println("제곱값: " + a * a);
		square.accept(5);
		
		BiConsumer<String, String> concat = (s1, s2) -> System.out.println(s1 + s2);
		concat.accept("Hello, ", "world!");
		
		DoubleConsumer inverse = number -> System.out.println(1/number);
		inverse.accept(3.0);
	}

}
