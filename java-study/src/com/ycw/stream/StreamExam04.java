package com.ycw.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExam04 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", "남자", 90),
				new Student("이순신", "남자", 95)
				);
		double avg = list.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		System.out.println("평균 점수: " + avg);
	}
}
