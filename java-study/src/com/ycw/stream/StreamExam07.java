package com.ycw.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamExam07 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", "남자", 90),
				new Student("이순신", "남자", 95),
				new Student("김유신", "남자", 80)
				);
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s.getName() + " : " + s.getScore()));
	}
}
