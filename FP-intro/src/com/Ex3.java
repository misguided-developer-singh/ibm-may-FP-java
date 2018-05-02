package com;

interface Adder {
	double add(double d1, double d2);
}

interface Joiner {
	String join(String s1, String s2);
}

// -----------------------------------------------
class Util {
	// public void testAdd(Adder adder) {
	// double d1 = 12.0;
	// double d2 = 13.0;
	// double result = adder.add(d1, d2);
	// System.out.println(result);
	// }
	//
	// public void testJoin(Joiner joiner) {
	// String s1 = "hello";
	// String s2 = "world";
	// String s = joiner.join(s1, s2);
	// System.out.println(s);
	// System.out.println();
	// }

	// -------------------------------------------------

	public void test(Adder adder) {
		double d1 = 12.0;
		double d2 = 13.0;
		double result = adder.add(d1, d2);
		System.out.println(result);
	}

	public void test(Joiner joiner) {
		String s1 = "hello";
		String s2 = "world";
		String s = joiner.join(s1, s2);
		System.out.println(s);
		System.out.println();
	}
}
// -----------------------------------------------

public class Ex3 {

	public static void main(String[] args) {

		Util util = new Util();
		util.test((double a, double b) -> a + b);
		util.test((Joiner) (a, b) -> a + b);
		util.test((Joiner) (a, b) -> a + " " + b);
		util.test((Joiner) (a, b) -> a + " " + b + " !");

	}

}
