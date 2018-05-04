package com.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Immutable_Ex {

	public static void main(String[] args) {

		String[] strings = { "a", "b", "a", "c" };

		String[] strings1 = 
				 Arrays.stream(strings)
				 	   .map(s -> s.equals("a") ? s.toUpperCase() : s)
				       .toArray(String[]::new);

		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(strings1));
	}

}
