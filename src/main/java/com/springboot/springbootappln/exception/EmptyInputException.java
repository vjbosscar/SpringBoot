package com.springboot.springbootappln.exception;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String errorcode;
	private String errorMessage;
	
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public EmptyInputException(String errorcode, String errorMessage) {
		super();
		this.errorcode = errorcode;
		this.errorMessage = errorMessage;
	}
	
	public EmptyInputException() {
	
	}
	

}
