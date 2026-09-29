package com.abstractclasses;

public class Myntra extends PaymentAdapter {
	
	@Override
	public void upi() {
		System.out.println("Myntra Accepts UPI Payment Mode");
	}

	@Override
	public void netBanking() {
		System.out.println("Myntra Accepts NetBanking Payment Mode");
	}

	public static void main(String[] args) {
		Myntra m = new Myntra();
		m.upi();
		m.netBanking();
	}

}
