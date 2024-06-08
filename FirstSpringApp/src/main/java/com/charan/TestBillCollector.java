package com.charan;

public class TestBillCollector {

	public static void main(String[] args) {
		BillCollector bc=new BillCollector();
		bc.setPayment(new DebitCardPayment());
		bc.billPayment(1232);
		BillCollector bc1=new BillCollector(new CreditCardPayment());
		bc1.billPayment(3201);
		BillCollector bc2=new BillCollector();
		bc2.setPayment(new UpiCardPayment());
		bc2.billPayment(20000);
		BillCollector bc3=new BillCollector(new DebitCardPayment());
		bc3.billPayment(324);

	}

}
