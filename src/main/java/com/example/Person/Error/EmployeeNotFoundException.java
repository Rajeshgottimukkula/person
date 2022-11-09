package com.example.Person.Error;

public class EmployeeNotFoundException extends RuntimeException{

	
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
