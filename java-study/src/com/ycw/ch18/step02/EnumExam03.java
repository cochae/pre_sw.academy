package com.ycw.ch18.step02;

public class EnumExam03 {
	public static void main(String[] args) {
		int day = DAY.MONDAY;

		switch (day) {
		case DAY.MONDAY:
			System.out.println("It's Monday.");
			break;
		case DAY.TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case DAY.WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case DAY.THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case DAY.FRIDAY:
			System.out.println("It's Friday.");
			break;
		case DAY.SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}
		if(DAY.MONDAY == MONTH.JANUARY) {
			System.out.println("same!");
		}
	}

}
