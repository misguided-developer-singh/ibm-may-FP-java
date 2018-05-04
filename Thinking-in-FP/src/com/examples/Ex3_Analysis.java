package com.examples;

import java.util.stream.Stream;

import com.model.Employee;

public class Ex3_Analysis {

	public static void main(String[] args) {

		double total;
		Employee[] employees = Employee.randomlyGenerate(20_000_000);

		// A. Functional style
		//----------------------------------------------------------
		System.out.println("state-less & sequential - stream");
		total=Time.timeIt(Ex3_Analysis::getTotalSalary1,employees);
		System.out.println("Total : "+total);
		//----------------------------------------------------------
		
		System.out.println();
		
		//----------------------------------------------------------
		System.out.println("state-less & parallel - stream");
		total=Time.timeIt(Ex3_Analysis::getTotalSalary2,employees);
		System.out.println("Total : "+total);
		//----------------------------------------------------------
		
		System.out.println();

		
		// B. Imperative
		
		//----------------------------------------------------------
		System.out.println("state-full & sequential - stream");
		total=Time.timeIt(Ex3_Analysis::getTotalSalary3,employees);
		System.out.println("Total : "+total);
		//----------------------------------------------------------
		
		System.out.println();
		
		//----------------------------------------------------------
		System.out.println("state-full & parallel - stream  with sync");
		total=Time.timeIt(Ex3_Analysis::getTotalSalary4,employees);
		System.out.println("Total : "+total);
		//----------------------------------------------------------
		
		System.out.println();

		//----------------------------------------------------------
		System.out.println("state-full & parallel - stream  with atomic adders");
		total=Time.timeIt(Ex3_Analysis::getTotalSalary5,employees);
		System.out.println("Total : "+total);
		//----------------------------------------------------------
	}

	// state-less & sequential-stream
	private static double getTotalSalary1(Employee[] employees) {
		return Stream.of(employees)
			  .mapToDouble(Employee::getSalary)
			  .sum();
	}

	// state-less & parallel-stream
	private static double getTotalSalary2(Employee[] employees) {
		return Stream.of(employees)
			  .parallel()	
			  .mapToDouble(Employee::getSalary)
			  .sum();
	}
	
	// imperative/state-full & sequential-stream
	private static double getTotalSalary3(Employee[] employees) {
		SalaryAdder salaryAdder=new SalaryAdder();
		Stream.of(employees)
			  .forEach(salaryAdder::accept);
		return salaryAdder.total;
	}
	
	// imperative/state-full & parallel-stream
	private static double getTotalSalary4(Employee[] employees) {
		SalaryAdder salaryAdder=new SalaryAdder();
		Stream.of(employees)
		      .parallel()
			  .forEach(salaryAdder::accept);
		return salaryAdder.total;
	}
	
	// imperative/state-full & sequential-stream
	private static double getTotalSalary5(Employee[] employees) {
		SalaryAdder salaryAdder=new SalaryAdder();
		Stream.of(employees)
		      .parallel()
			  .forEach(salaryAdder::accept2);
		return salaryAdder.doubleAdder.doubleValue();
	}

}
