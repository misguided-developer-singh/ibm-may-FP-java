package com.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class MyList<T> implements Iterable<T> {

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}
}

public class Q1 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		for (String iutem : arrayList) {
		}

		LinkedList<String> linkedList = new LinkedList<>();
		for (String item : linkedList) {
		}

		MyList<String> myList = new MyList<>();
		for (String item : myList) {

		}

		Iterator<String> iterator = myList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();

		}

	}

}
