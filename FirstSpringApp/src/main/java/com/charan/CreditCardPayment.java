package com.charan;

public class CreditCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "CreditCard Payment is Successfull  "+amount+" Rupees Deducted";
	}

}
