package com.shubhampaliwal;

public class Student {
	
	private String firstName;
	private String lastName;
	private String packageOpted;
	
	public Student(String firstName, String lastName, String packageOpted) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.packageOpted = packageOpted;
	}
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public String getLastName() {
		
		return lastName;
	}
	
	public String getPackageOpted() {
		
		return packageOpted;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}
	
	public void setPackageOpted(String packageOpted) {
		
		this.packageOpted = packageOpted;
	}
}