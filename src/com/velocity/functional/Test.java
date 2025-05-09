package com.velocity.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {
		// Before Java 8
		Print print = new Print();
		print.accept("Velocity");

		// After java 8
		Consumer<String> consumer = msg -> System.out.println("My Message is " + msg);
		consumer.accept("Hello World !!");
		
		// Use case
		List<Integer> numbers = Arrays.asList(10,20,30,40,50);
		// For- each Loop
		// iterator
		// listIterator
		
		// New For-Each method added to use consumer interface.
		numbers.forEach(num -> System.out.println(num));
	}
}
