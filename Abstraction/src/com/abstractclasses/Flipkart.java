package com.abstractclasses;

public class Flipkart extends PaymentAdapter{
	
	@Override
	public void dc() {
		System.out.println("Fipkart Accepts Debit Card Payment mode");
	}

	@Override
	public void cc() {
		System.out.println("Fipkart Accepts Credit Card Payment mode");
	}

	public static void main(String[] args) {
		Flipkart fk = new Flipkart();
		fk.dc();
		fk.cc();
	}

}
