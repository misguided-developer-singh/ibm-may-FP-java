package com.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex1 {

	public static void main(String[] args) {

		//-------------------------------------------------------------------------
		
		// Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
//		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		
//		integers
//		 .stream()
//		 .filter(n->n%2==0)
//		 .forEach(System.out::println);
//		
		//-------------------------------------------------------------------------
		
		Employee[] employees=Employee.SOME;
		
		Stream.of(employees)
			.filter(e->e.getSalary()>=2500)
			.map(e->e.getName())
			.sorted()
			.forEach(System.out::println);
		
		//-------------------------------------------------------------------------
		

	}

}
