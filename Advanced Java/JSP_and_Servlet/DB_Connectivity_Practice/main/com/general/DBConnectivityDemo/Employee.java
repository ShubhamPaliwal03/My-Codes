package com.general.DBConnectivityDemo;

public class Employee {
	
	private int id;
	private int salary;
	private String firstname;
	private String lastname;
	private String email;
	private String designation;
	
	Employee(int id, int salary, String firstname, String lastname, String email, String designation) {
		
		this.id = id;
		this.salary = salary;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.designation = designation;
	}
	
	Employee(int salary, String firstname, String lastname, String email, String designation) {
		
		this.salary = salary;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.designation = designation;
	}
	
	public void setId(int id) {
		
		this.id = id;
	}
	
	public void setSalary(int salary) {
		
		this.salary = salary;
	}
	
	public void setFirstname(String firstname) {
		
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		
		this.lastname = lastname;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public void setDesignation(String designation) {
		
		this.designation = designation;
	}
	
	public int getId() {
		
		return id;
	}
	
	public int getSalary() {
		
		return salary;
	}
	
	public String getFirstname() {
		
		return firstname;
	}
	
	public String getLastname() {
		
		return lastname;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public String getDesignation() {
		
		return designation;
	}
}