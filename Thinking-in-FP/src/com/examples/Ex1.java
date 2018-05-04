package com.examples;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex1 {

	public static void main(String[] args) {

		Employee[] employees = Employee.randomlyGenerate(10);
		
		Stream<Employee> stream=Arrays.stream(employees);
		double totalSalary=stream
								.parallel()
								.peek(e->{
									Thread thread=Thread.currentThread();
									System.out.println(thread.getName() +"-"+e.getId());
								})	
								.mapToDouble(Employee::getSalary)
								.sum();
		System.out.println(totalSalary);

	}

}
