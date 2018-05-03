package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.lib.ItemsLib;
import com.model.Product;
import com.model.ProductType;

public class App2 {

	public static void main(String[] args) {

		// ----------------------------------------------------------------------
		List<Product> products = Arrays.asList(
				new Product("213123", "Item-1", 1000.00, ProductType.ELEC),
				new Product("342344", "Item-2", 3000.00, ProductType.OTHER),
				new Product("131233", "Item-3", 2000.00, ProductType.ELEC),
				new Product("525233", "Item-4", 4000.00, ProductType.OTHER),
				new Product("645343", "Item-5", 5000.00, ProductType.ELEC),
				new Product("456456", "Item-6", 7000.00, ProductType.OTHER));

		// ----------------------------------------------------------------------
		// in Java 8 ( functional style )

		ItemsLib.forEach(products, t -> System.out.println(t.getName()));
		ItemsLib.forEach(products, t -> System.out.println(t.getPrice()));
		ItemsLib.forEach(products, t -> System.out.println(t.getName() + "\t" + t.getPrice()));
		
		// ----------------------------------------------------------------------

	}

}
