package com.ycw.ch13.step02;

public class Course {
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가)  Course1을 등록함");
		
	}
	
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가)  Course2을 등록함");
		
	}
	
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가)  Course3을 등록함");
		
	}
	
}
