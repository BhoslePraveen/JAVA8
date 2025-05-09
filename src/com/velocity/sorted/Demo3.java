package com.velocity.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		// Handling Null Values in a Stream
		List<String> listWithNulls = Arrays.asList("Zoe", null, "Alice", null, "Bob");
		
//		listWithNulls.stream()
//        .sorted()
//        .forEach(System.out::println);
		
		listWithNulls.stream()
        .sorted(Comparator.nullsFirst(Comparator.naturalOrder())) // Nulls come first
        .forEach(System.out::println);

	}

}
