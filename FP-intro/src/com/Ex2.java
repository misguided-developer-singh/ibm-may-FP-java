package com;

@FunctionalInterface
interface StringToIntMapper {
	int map(String s);
}
//
// interface Adder {
// int apply(int n1, int n2);
// }

public class Ex2 {

	public static void main(String[] args) {

		StringToIntMapper mapper = s -> s.length();
		int n = mapper.map("hello");
		System.out.println(n);

		// Adder adder = (n1, n2) -> n1 + n2;
		//
		// System.out.println(adder.apply(12, 13));
		// System.out.println(adder.apply(12, 14));

	}

}
