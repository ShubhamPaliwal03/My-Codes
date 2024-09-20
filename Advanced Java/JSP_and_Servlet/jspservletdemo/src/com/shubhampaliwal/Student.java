package com.shubhampaliwal;

public class Student {
	
	private String name;
	private String course;
	private int roll;
	
	public Student(String name, String course, int roll) {
		super();
		this.name = name;
		this.course = course;
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getRoll() {
		return roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}
}
