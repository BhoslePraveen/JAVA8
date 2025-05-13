package com.velocity.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo5 {

	public static void main(String[] args) {
		// min() – Get the Minimum Element
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

		int min = numbers.stream()
		                 .min(Integer::compareTo)
		                 .orElse(-1);
		
		System.out.println(min); 
		
		List<String> names = Arrays.asList("Praveen", "Raj", "Amit");
		String shortestName = names.stream()
			    .min(Comparator.comparing(String::length))
			    .orElse("No name");
		
		System.out.println(shortestName);
	}

}
