package com.ycw.stream;

public class Student implements Comparable<Student>{
	private String name;
	private String gender;
	private int score;
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getScore() {
		return score;
	}

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}
}
