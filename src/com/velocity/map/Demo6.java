package com.velocity.map;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo6 {

	public static void main(String[] args) {
		// max() – Get the Maximum Element
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

		int max = numbers.stream().max(Integer::compareTo).orElse(-1);

		System.out.println(max);

		List<String> names = Arrays.asList("Praveen", "Raj", "Amit");
		String longestName = names.stream()
			    .max(Comparator.comparing(String::length))
			    .orElse("No name");

			System.out.println(longestName);

	}

}
