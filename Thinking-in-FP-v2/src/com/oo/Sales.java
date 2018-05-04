package com.oo;

public class Sales extends MonthByMonthQuantity {

	protected Sales(double[] values) {
		super(values);
	}

	@Override
	public String getName() {
		return "sales";
	}

}
