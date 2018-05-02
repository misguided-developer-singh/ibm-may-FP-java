package com;

import java.util.function.Consumer;

public class Ex5 {

	public static void main(String[] args) {

		Consumer<String> consumer = (String message) -> {
			System.out.println(message);
		};
		consumer.accept("hello");

	}

}
