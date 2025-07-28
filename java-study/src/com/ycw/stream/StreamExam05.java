package com.ycw.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExam05 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("아이유", "지드래곤", "지코", "리쌍", "지드래곤");
		
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		
		names.stream().filter(n->n.startsWith("지")).forEach(n->System.out.println(n));

		System.out.println();
		names.stream().distinct().filter(n->n.startsWith("지")).forEach(n->System.out.println(n));

	}
}
