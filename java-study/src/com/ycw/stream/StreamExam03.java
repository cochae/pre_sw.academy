package com.ycw.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam03 {
	public static int sum;
	public static void main(String[] args) {
		String[] strArray = {"아이유", "마마무", "블랙핑크"};
		Stream <String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.print(a + ", "));
		System.out.println();
		System.out.println("----------------");
		final int sum = 0;
		IntStream stream = IntStream.rangeClosed(1,  100);
		//stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
	}
}
