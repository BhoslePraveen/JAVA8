package com.velocity.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo9 {

	public static void main(String[] args) {
		// skip(n) – Skip the First n Elements

		List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

		
		List<Integer> skipped2 = numbers.stream()
                .skip(2)
                .collect(Collectors.toList());
		
		System.out.println(skipped2);
	}

}
