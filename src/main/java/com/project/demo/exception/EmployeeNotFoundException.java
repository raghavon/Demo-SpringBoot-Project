package com.project.demo.exception;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(String s)
	{
		super(s);
	}
}
