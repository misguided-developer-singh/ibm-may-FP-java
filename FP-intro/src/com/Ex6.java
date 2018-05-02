package com;

import java.util.ArrayList;
import java.util.List;

class Box<T> {
	T element;
}

public class Ex6 {

	public static <T> void printArray(T[] array) {

	}

	public static void main(String[] args) {

		Box<String> box = new Box<String>();
		Box<Integer> box2 = new Box<Integer>();

		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<>();
		
		printArray(new String[]{"hello","world"});

	}

}
