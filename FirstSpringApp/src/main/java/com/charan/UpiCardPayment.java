package com.charan;

public class UpiCardPayment implements IPayment {

	@Override
	public String pay(double amount) {
		return "UpiCard Payment is Succesful.."+amount+" Rupees Deducted";
	}

}
