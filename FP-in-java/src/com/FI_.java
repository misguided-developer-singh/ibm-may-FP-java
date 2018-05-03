package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class FI_ {

	public static void main(String[] args) {

		// -----------------------------------------------------------
		// Supplier<String> supplier = () -> {
		// return "hello";
		// };
		//
		// Consumer<String> consumer = (str) -> {
		//
		// };
		//
		// UnaryOperator<String> operator = (str) -> {
		// return str;
		// };
		// BinaryOperator<String> binaryOperator = (str1, str2) -> {
		// return str1 + str2;
		// };
		//
		// Function<String, Integer> function = (str) -> {
		// return 100;
		// };
		//
		// Predicate<String> predicate = (str) -> {
		// return true;
		// };
		// -----------------------------------------------------------

		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);

		integers.replaceAll(n -> n > 3 ? 0 : n); // UnaryOperator

		// System.out.println(integers);

		// -----------------------------------------------------------

		// Optional<Integer> result=
		// Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
		// .stream()
		// .reduce((acc, n) -> acc + n);
		//
		// Integer sum=result.orElse(0);
		// System.out.println(sum);

		// -----------------------------------------------------------

		// Supplier<Integer> supplier=()->{
		// return 100;
		// };
		//
		// int i=supplier.get();

		// or

		// IntSupplier intSupplier = () -> {
		// return 100;
		// };

		Function<String, Integer> function = (str) -> {
			return str.length();
		};
		ToIntFunction<String> toIntFunction = (str) -> {
			return str.length();
		};

		IntToDoubleFunction intToDoubleFunction = (in) -> {
			return 100.00;
		};

		IntUnaryOperator intUnaryOperator = (in) -> {
			return in;
		};

		// -----------------------------------------------------------

	}

}
