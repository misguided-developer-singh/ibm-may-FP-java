package com;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

import com.model.Employee;

public class Function_Composition {

	public static void main(String[] args) throws IOException {

		// ------------------------------------------------------------------

		// IntPredicate predicate1 = n -> n > 10;
		// IntPredicate predicate2 = n -> n < 100;
		//
		// IntPredicate intPredicate = predicate1.and(predicate2);
		//
		// boolean b = intPredicate.test(200);

		// ------------------------------------------------------------------

		// PrintWriter printWriter = new PrintWriter("logs.txt");
		// Consumer<String> fileConsumer = printWriter::println;
		// Consumer<String> consoleConsumer = System.out::println;
		//
		// Consumer<String> logConsumer = consoleConsumer.andThen(fileConsumer);
		//
		// logConsumer.accept("program started");

		// ------------------------------------------------------------------

		// Function<Employee, String> getName = Employee::getName;
		// Function<String, Character> getFirstLetter = name -> name.charAt(0);
		// Function<Employee, Character> initial = getName.andThen(getFirstLetter);
		//
		// Employee employee = new Employee("Nag", 1000);
		// System.out.println(initial.apply(employee));

		// ------------------------------------------------------------------

		Comparator<Employee> byName = Comparator.comparing(Employee::getName);
		Comparator<Employee> bySalary = Comparator.comparing(Employee::getSalary);
		Comparator<Employee> byNameAndSalary = byName.thenComparing(bySalary);

		Employee employee1 = new Employee("Nag", 2000);
		Employee employee2 = new Employee("Nag", 6000);

		int diff = byNameAndSalary.compare(employee1, employee2);
		System.out.println(diff);
	}
}
