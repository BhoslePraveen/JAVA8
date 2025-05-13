package com.velocity.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo8 {

	public static void main(String[] args) {
		// limit(n) – Take the First n Elements
		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

		List<Integer> top3 = numbers.stream().limit(3).collect(Collectors.toList());

		System.out.println(top3);

	}

}
