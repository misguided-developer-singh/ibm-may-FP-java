package com.examples;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex2 {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 3, 2, 5, 4, 6, 3, 5, 9);
		
		stream=stream
				.filter(n->{
					System.out.println("filtering : "+n);
					return n%2==0?true:false;
				})
				.map(n->{
					System.out.println("mapping : "+n);
					return n*n;
				})
				.limit(2);

		
		//stream.forEach(n->System.out.println(n));
		
	}

}
