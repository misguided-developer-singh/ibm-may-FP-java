package com;

import java.util.function.Consumer;

public class Ex9 {

	static int staVar = 1;
	int insVar = 2;

	public Consumer<String> getConsumer() {
		int loc = 3;
		Consumer<String> consumer = (s) -> {
			System.out.println(s);
			System.out.println(loc);
			System.out.println(insVar);
			System.out.println(staVar);
		};
		return consumer;
	}

	public static void main(String[] args) {
		Ex9 ex9 = new Ex9();
		Consumer<String> consumer = ex9.getConsumer();
		consumer.accept("LE");
	}

}
