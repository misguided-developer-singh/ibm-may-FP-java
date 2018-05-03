package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex6 {

	public static void main(String[] args) {

		Employee[] employees=Employee.SOME;
		

		   Map<Boolean,List<Employee>> brackets=
				   Stream.of(employees)
				   .collect(Collectors.partitioningBy(e->e.getSalary()>2000));  
		   
		   System.out.println(brackets);
		
		
	}

}
