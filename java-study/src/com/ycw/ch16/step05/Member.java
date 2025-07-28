package com.ycw.ch16.step05;

public class Member {
	private String name;
	private String gender;
	private int point;
	
	public String getGender() {
		return gender;
	}
	public int getPoint() {
		return point;
	}
	
	public Member(String name, String gender, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.point = point;
	}
	
}
