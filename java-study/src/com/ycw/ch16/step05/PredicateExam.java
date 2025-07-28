package com.ycw.ch16.step05;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExam {
	private static List<Member> memberList = List.of(
			new Member("홍길동", "male", 90),
			new Member("김영희", "female", 90),
			new Member("박철수", "male", 85),
			new Member("이혜숙", "female", 87)
			);
			
	public static int getSum(Predicate<Member> predicate) {
		int sum = 0;
		for(Member member : memberList) {
			if(predicate.test(member)) {
				sum += member.getPoint();
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Predicate<Member> p = (member) -> {
			if(member.getGender().equals("male"))
			return true;
			else
			return false;
			};
		int maleTotal = getSum(p);
		System.out.println("남자 총점: " + maleTotal);
	}

}
