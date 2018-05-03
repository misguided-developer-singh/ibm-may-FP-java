package com.lib;

import java.util.List;
import java.util.function.Consumer;

import com.model.Product;

public class ItemsLib {

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T item : list) {
			consumer.accept(item);
		}
	}

}
