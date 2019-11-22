package com.ustglobal.exception.checkedexception;

public class TestAmount {

	public static void main(String[] args) {

		System.out.println("Main started");
		
		ValidateAmount v = new ValidateAmount();
		try {
			
			v.checkAmount(60000);
			System.out.println("Withdraw your cash");
			
		} catch (InvalidAmountException e) {
			
			System.err.println(e.getMessage());
		}
		
		System.out.println("Main ended");
	}

}
