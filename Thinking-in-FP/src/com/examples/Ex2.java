package com.examples;

import java.util.Arrays;
import java.util.concurrent.atomic.DoubleAdder;
import java.util.stream.Stream;

import com.model.Employee;


public class Ex2 {

	public static void main(String[] args) {
		
		Employee[] employees = Employee.randomlyGenerate(1000);
		
		SalaryAdder salaryAdder=new SalaryAdder();
		
		Stream<Employee> stream=Arrays.stream(employees);
		stream.parallel()
			  .forEach(salaryAdder::accept);
								
		System.out.println(salaryAdder.doubleAdder.doubleValue());

	}

}
