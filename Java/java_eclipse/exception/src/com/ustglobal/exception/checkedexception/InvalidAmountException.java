package com.ustglobal.exception.checkedexception;

public class InvalidAmountException extends Exception {

	private String message = "Daily limit is 50000";
	
	@Override
	public String getMessage() {
		
		return message;
	}
}
