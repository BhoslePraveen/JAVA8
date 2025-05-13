package com.velocity.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo7 {

	public static void main(String[] args) {
		List<Product> products = Arrays.asList(new Product("Pen", 10.5), new Product("Notebook", 45.0),
				new Product("Pencil", 5.0));

		Product cheapest = products.stream().min(Comparator.comparingDouble(p -> p.getPrice())).orElse(null);

		Product costliest = products.stream().max(Comparator.comparingDouble(p -> p.getPrice())).orElse(null);

		System.out.println("Cheapest: " + cheapest.getName());
		System.out.println("Costliest: " + costliest.getName());

	}

}
