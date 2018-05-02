package com.shop;

import com.shop.bill.BillingImpl;

public class App {

	public static void main(String[] args) {

		// init
		BillingImpl billing = new BillingImpl();

		// use
		String[] cart = { "111", "222" };
		double totalPrice = billing.getTotalPrice(cart);
		System.out.println("Total : " + totalPrice);

		// destroy
		// ....

	}

}
