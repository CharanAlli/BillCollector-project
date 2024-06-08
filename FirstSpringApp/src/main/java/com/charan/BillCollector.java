package com.charan;

public class BillCollector {
	IPayment payment;
	public BillCollector() {
		System.out.println("Parameterless Constructer of BillCollector");
		
	}
	public void setPayment(IPayment payment)
	{
		this.payment=payment;
	}
	public BillCollector(IPayment payment)
	{
		this.payment=payment;
		System.out.println("Parameterized Constructor of BillCollector");
	}
	public void billPayment(double amount)
	{
		//CreditCardPayment ccp=new CreditCardPayment();
		//String status=ccp.pay(amount);
		String status=payment.pay(amount);
		System.out.println(status);
	}

}
