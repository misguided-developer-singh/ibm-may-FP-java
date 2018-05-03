package com.examples;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.model.Employee;

public class Ex5 {
	
	public static void main(String[] args) {
		

		
		OptionalInt optional=Stream.of(1,2,1)
		.mapToInt(n->n)
		.min();
		
		if(optional.isPresent()) {
			System.out.println(optional.getAsInt());
		}
		
		
	}

}
