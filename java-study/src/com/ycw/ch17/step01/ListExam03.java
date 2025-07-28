package com.ycw.ch17.step01;

import java.util.Arrays;
import java.util.List;

public class ListExam03 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("서울", "대전", "대구", "부산");
		list.add("광주");

		List<String> colors = List.of("Red", "Green", "Blue");
		list.add("Magenta");
		
		
	}
}
