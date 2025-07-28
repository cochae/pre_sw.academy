package com.ycw.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExam01 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("서울", "대전", "대구", "부산");
		
		
		Stream<String> stream = list.stream();
		stream.forEach(city -> System.out.println(city));
	}
}
