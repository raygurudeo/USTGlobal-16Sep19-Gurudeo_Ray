package com.ustglobal.exception.customexception;

public class InvalidAgeException extends RuntimeException {

	private String message = "Invalid age";

	public InvalidAgeException() {
	}
	public InvalidAgeException(String msg) {

		this.message = msg;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
