package com.charan;

public class DebitCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "DebitCard Payment is Succesful.."+amount+" Rupees Deducted";
	}

}
