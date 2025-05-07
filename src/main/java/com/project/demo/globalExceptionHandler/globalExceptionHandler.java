package com.project.demo.globalExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.demo.exception.EmployeeNotFoundException;
import com.project.demo.utility.RequestStatus;

@RestControllerAdvice
public class globalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public RequestStatus handleUserNotFoundException(EmployeeNotFoundException ue){
		return new RequestStatus(ue.getMessage(),200);
	}
}