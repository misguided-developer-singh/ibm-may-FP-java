package com.examples;

import java.util.concurrent.atomic.DoubleAdder;

import com.model.Employee;

public class SalaryAdder {

	double total;
	public synchronized void accept(Employee e) {
		total += e.getSalary();
	}

	DoubleAdder doubleAdder = new DoubleAdder();
	public void accept2(Employee e) {
		doubleAdder.add(e.getSalary());
	}
	
}