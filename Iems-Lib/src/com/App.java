package com;

import java.util.Arrays;
import java.util.List;

import com.lib.ItemsLib;
import com.model.Employee;

public class App {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(Employee.SOME);

		List<Integer> allSalaries = ItemsLib.map(employees, item -> item.getSalary());
		List<Integer> lowSalaries = ItemsLib.filter(allSalaries, item -> item < 2000);
		ItemsLib.forEach(lowSalaries, item -> System.out.println(item));
		
		//----------------------------------------------------------------
		
		employees
		.stream()
		.map(item -> item.getSalary())
		.filter(item -> item < 2000)
		.forEach(item -> System.out.println(item));
		
		//----------------------------------------------------------------
		

	}

}
