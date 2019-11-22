package com.ustglobal.exception.checkedexception;

public class ValidateAmount {

	void checkAmount(int amount)  throws InvalidAmountException {
		
		if(amount > 50000) {
			
			throw new InvalidAmountException();
		}
	}
}
