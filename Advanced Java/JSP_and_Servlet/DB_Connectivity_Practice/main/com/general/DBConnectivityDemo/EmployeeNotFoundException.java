package com.general.DBConnectivityDemo;

public class EmployeeNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	EmployeeNotFoundException(String msg) {
		
		super(msg);
	}
}