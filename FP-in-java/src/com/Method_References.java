package com;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import com.model.Employee;

//--------------------------------------------------------------------------

interface Print {
	void doPrint();
}

class Util {
	public static void m() {
		System.out.println("printing something...");
	}
}

class Person {
	String name;

	public void sayName(String message) {
		System.out.println(message + ", im  " + this.name);
	}
}

public class Method_References {

	public static void main(String[] args) {

		// --------------------------------------------------------------------------
		// Print print = () -> {
		// Util.m();
		// };

		// or

		// Print print = Util::m;
		// print.doPrint();

		// --------------------------------------------------------------------------

		// Static method-references

		Supplier<Thread> s1 = () -> {
			return Thread.currentThread();
		};

		// --------------------------------------------------------------------------

		// or

		Supplier<Thread> s2 = Thread::currentThread;
		Thread thread = s2.get();
		System.out.println(thread.getName());

		Consumer<String> consumer = (message) -> {
			System.out.println(message);
		};
		
		// --------------------------------------------------------------------------

		// or

		Consumer<String> consumer2 = System.out::println;
		consumer2.accept("welcome");

		// --------------------------------------------------------------------------

		// Instance method (instance specified)
		// Employee frank = new Employee("Frank", 3000);

		// Integer i = frank.getSalary();

		// Supplier<Integer> supplier=()->frank.getSalary();
		// System.out.println(supplier.get());

		// Supplier<Integer> supplier=frank::getSalary;
		// System.out.println(supplier.get());

		// --------------------------------------------------------------------------
		// An instance method (instance not specified)
		// Function<Employee, Integer> f1 = Employee::getSalary;
		// Integer sal = f1.apply(frank);
		// System.out.println(sal);

		// BiConsumer<Person, String> consumer3 = Person::sayName;
		// Person person=new Person();
		// person.name="Nag";
		// consumer3.accept(person, "hello");
		// consumer3.accept(person, "hi");

		// --------------------------------------------------------------------------

		Comparator<Employee> byName = (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		};
		// or
		Comparator<Employee> byName2 = Comparator.comparing((e) -> e.getName());
		// or
		Comparator<Employee> byName3 = Comparator.comparing(Employee::getName);

		main2();

		// ----------------------------------------------------------------------------

		// Supplier<Employee> supplier = Employee::new;
		BiFunction<String, Integer, Employee> supplier = Employee::new;
		Employee employee = supplier.apply("Nag", 1000);

		// --------------------------------------------------------------------------
	}

	public static <T> void printAll(T[] array, Function<T, String> toStringFun) {
		int i = 0;
		for (T t : array)
			System.out.println(i++ + ":\t" + toStringFun.apply(t));
	}

	public static void main2() {

		Employee dept[] = new Employee[5];
		dept[0] = new Employee("Alec", 1500);
		dept[1] = new Employee("Bob", 1600);
		dept[2] = new Employee("Claire", 1700);
		dept[3] = new Employee("Danielle", 1800);
		dept[4] = new Employee("Ethan", 1900);

		printAll(dept, Employee::getName);

		System.out.println("");

		// Compile-time error: type inference failure
		// printAll(dept, Employee::getSalary);

		printAll(dept, emp -> "" + emp.getSalary());

	}

}
