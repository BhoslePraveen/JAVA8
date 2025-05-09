package com.velocity.sorted;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Praveen", "Amit", "Zara", "Bhavya");

		//Natural Sorting Order
		List<String> sortedNames = names.stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println(sortedNames);
		
		System.out.println("==================================");
		
        // Reverse Sorting Order : Reverse Order with Comparator
		List<String> reverseSortedNames = names.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());

		System.out.println(reverseSortedNames);

	}

}
