package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {

		List<Integer[]> list = new ArrayList<>();
		list.add(new Integer[]{1,2,3,4,5,6});
		list.add(new Integer[]{4,5,6,7,8,9});
		
		list
		.stream()  
		.flatMap(arr->Stream.of(arr))
		.distinct()
		.forEach(e->System.out.println(e));

	}

}
