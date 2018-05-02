package com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ItemsLib {

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T item : list) {
			consumer.accept(item);
		}
	}
	public static <T, R> List<R> map(List<T> list, Function<T, R> function) {
		List<R> mappedList = new ArrayList<>();
		for (T item : list) {
			R r = function.apply(item);
			mappedList.add(r);
		}
		return mappedList;
	}
	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}

}
